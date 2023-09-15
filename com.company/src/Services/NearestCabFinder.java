package Services;

import Entities.Cab;
import Entities.Location;
import Entities.Rider;
import Enums.CabStatus;
import Enums.DriverStatus;

import java.util.List;

public class NearestCabFinder implements ICabFindingStrategy{

    @Override
    public Cab findCab(Rider rider, Location location, List<Cab> cabs) {
        Cab nearestCab=null;
        double minDistance = Double.MAX_VALUE;
        for(Cab cab: cabs){
            if(cab.getCabStatus().equals(CabStatus.AVAILABLE)&&cab.getDriver().getDriverStatus().equals(DriverStatus.AVAILABLE)){
                if(rider.getLocation().calculateDistance(cab.getLocation())<minDistance){
                    nearestCab=cab;
                    minDistance=rider.getLocation().calculateDistance(cab.getLocation());
                }
            }
        }
        return nearestCab;
    }
}
