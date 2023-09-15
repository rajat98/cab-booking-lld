package Services;

import Entities.Ride;

public interface ICostStrategy {
    Double getTripCost(Ride ride);
}
