package Services;

import Entities.Location;

public class LocationUtil {
    public static Location getRandomLocation(){
        return new Location((int) (Math.random() * 1000) +1, (int)(Math.random()*1000)+1);
    }
}
