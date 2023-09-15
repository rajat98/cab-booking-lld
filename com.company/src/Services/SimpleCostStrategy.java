package Services;

import Entities.Ride;

public class SimpleCostStrategy implements ICostStrategy{
    private final static double COST_PER_KM = 20;
    @Override
    public Double getTripCost(Ride ride) {
        return ride.getDistance()*COST_PER_KM;
    }
}
