package Services;

import Entities.Cab;
import Entities.Location;
import Entities.Rider;

import java.util.List;

public interface ICabFindingStrategy {
    Cab findCab(Rider rider, Location location, List<Cab> cabList);
}
