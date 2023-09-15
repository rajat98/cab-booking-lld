package Services;

import Entities.Ride;

import java.time.LocalDateTime;

public class RideService implements IRideService {
    @Override
    public Double endTrip(Ride ride) {
        ride.setDistance(ride.getDesLocation().calculateDistance(ride.getSrcLocation()));
        ride.setEndTime(LocalDateTime.now());
        ICostStrategy costStrategy = new SimpleCostStrategy();
        ride.setCost(costStrategy.getTripCost(ride));
        ICabService cabService = new CabService();
        cabService.updateCabLocation(ride.getCab(), ride.getDesLocation());
        ride.getRider().setLocation(ride.getDesLocation());
        System.out.println(ride.toString());
        return ride.getCost();
    }
}
