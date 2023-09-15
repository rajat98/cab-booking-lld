package Entities;

import Services.LocationUtil;

public class Rider extends Person{
    private static int idGen=1;
    private int id;
    private Location location;

    public Rider(String name){
        super(name);
        this.id = idGen++;
        this.location = LocationUtil.getRandomLocation();
    }

    public int getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", person=" + this.getName() +
                '}';
    }
}
