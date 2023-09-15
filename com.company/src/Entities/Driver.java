package Entities;

import Enums.DriverStatus;

public class Driver extends Person {
    private static int idGen = 1;
    private int id;
    private DriverStatus driverStatus;
    private Cab cab;

    public Driver(String name) {
        super(name);
        this.id = idGen++;
        this.driverStatus = DriverStatus.AVAILABLE;
    }

    public static int getIdGen() {
        return idGen;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Cab getCab() {
        return cab;
    }

    public int getId() {
        return id;
    }

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", driverStatus=" + driverStatus +
                ", person=" + this.getName() +
                '}';
    }
}
