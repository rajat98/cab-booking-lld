package Services;

import Entities.Driver;
import Entities.Ride;
import Entities.Rider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiderService implements IRiderService {
    private static Map<String, List<Ride>> riderHistoryMap = new HashMap<>();

    @Override
    public Rider registerRider(String name) {
        Rider rider = new Rider(name);
        riderHistoryMap.put(name, new ArrayList<>());
        System.out.printf("New Rider registered successfully name: %s id: %d\n", rider.getName(), rider.getId());
        return rider;
    }

    @Override
    public List<Ride> getRiderHistory(String name) {
        List<Ride> rideHistory = riderHistoryMap.get(name);
        for (Ride ride: rideHistory){
            System.out.printf("%s\n", ride.toString());
        }
        return rideHistory;
    }
    @Override
    public void updateRiderHistoryMap(String rider, Ride ride){
        riderHistoryMap.get(rider).add(ride);
    }
}
