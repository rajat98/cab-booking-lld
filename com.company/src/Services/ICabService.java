package Services;

import Entities.*;

public interface ICabService {
    public Cab registerCab(Driver driver);
    public Ride bookCab(Rider rider, Location destination);
    public void updateCabLocation(Cab cab, Location newLocation);
}
