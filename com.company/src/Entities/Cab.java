package Entities;

import Enums.CabStatus;
import Services.LocationUtil;

import java.util.Random;
import java.util.UUID;

public class Cab extends Vehicle{
    //has a driver
//    private static String id
    private UUID id;
    private Driver driver;
    private CabStatus cabStatus;
    private Location location;
    public Cab(Driver driver) {
        super();
        this.driver = driver;
        this.id = UUID.randomUUID();
        this.cabStatus = CabStatus.AVAILABLE;
        this.location = LocationUtil.getRandomLocation();
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getLocation() {
        return location;
    }

    public CabStatus getCabStatus() {
        return cabStatus;
    }

    public void setCabStatus(CabStatus cabStatus) {
        this.cabStatus = cabStatus;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "id=" + id +
                ", driver=" + driver +
                ", cabStatus=" + cabStatus +
                '}';
    }


}
