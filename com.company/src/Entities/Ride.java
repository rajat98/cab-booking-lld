package Entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Ride {
    private UUID id;
    private Rider rider;
    private Cab cab;
    private Location srcLocation;
    private Location desLocation;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double cost;
    private Double distance;

    public Ride(Rider rider, Cab cab, Location srcLocation, Location desLocation, LocalDateTime startTime) {
        this.rider = rider;
        this.cab = cab;
        this.srcLocation = srcLocation;
        this.desLocation = desLocation;
        this.startTime = startTime;
        this.id = UUID.randomUUID();
    }

    public Rider getRider() {
        return rider;
    }

    public Cab getCab() {
        return cab;
    }

    public Double getCost() {
        return cost;
    }

    public Double getDistance() {
        return distance;
    }

    public Location getSrcLocation() {
        return srcLocation;
    }

    public Location getDesLocation() {
        return desLocation;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                " rider=" + rider +
                ", cab=" + cab +
                ", srcLocation=" + srcLocation +
                ", desLocation=" + desLocation +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cost=" + cost +
                ", distance=" + distance +
                '}';
    }
}
