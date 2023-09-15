package Services;

import Entities.*;
import Enums.CabStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CabService implements ICabService{
    List<Cab> cabs = new ArrayList<>();

    @Override
    public Cab registerCab(Driver driver) {
        Cab cab = new Cab(driver);
        driver.setCab(cab);
        System.out.printf("New cab registered %s\n", cab.toString());
        cabs.add(cab);
        return cab;
    }

    @Override
    public Ride bookCab(Rider rider, Location destination) {
        ICabFindingStrategy cabFindingStrategy =  new NearestCabFinder();
        Cab nearestCab = cabFindingStrategy.findCab(rider, destination,cabs);
        nearestCab.setCabStatus(CabStatus.BOOKED);
        Ride ride = new Ride(rider, nearestCab,rider.getLocation(), destination, LocalDateTime.now());
        IRiderService riderService = new RiderService();
        riderService.updateRiderHistoryMap(rider.getName(), ride);
        return ride;
    }






    @Override
    public void updateCabLocation(Cab cab, Location newLocation) {
        cab.setLocation(newLocation);
    }
}
