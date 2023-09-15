package Services;

import Entities.Ride;
import Entities.Rider;

import java.util.List;

public interface IRiderService {
    public Rider registerRider(String name);
    public List<Ride> getRiderHistory(String name);
    public void updateRiderHistoryMap(String name, Ride ride);
}
