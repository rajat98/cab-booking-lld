import Entities.*;
import Enums.DriverStatus;
import Services.*;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
        IRideService iRideService = new RideService();
        IRiderService iRiderService = new RiderService();
        ICabService iCabService = new CabService();
        IDriverService iDriverService = new DriverService();

        // register user
        Rider rider = iRiderService.registerRider("Rajat");
        //register driver
        Driver driver1 = iDriverService.registerDriver("Driver Anna 1");
        Driver driver2 =iDriverService.registerDriver("Driver Anna 2");
        Driver driver3 =iDriverService.registerDriver("Driver Anna 3");
        Driver driver4 =iDriverService.registerDriver("Driver Anna 4");
        Driver driver5 =iDriverService.registerDriver("Driver Anna 5");

        iDriverService.updateStatus(driver1.getName(), DriverStatus.UNAVAILABLE);
        //registered cab
        Cab cab1 = iCabService.registerCab(driver1);
        Cab cab2 = iCabService.registerCab(driver2);
        Cab cab3 = iCabService.registerCab(driver3);
        Cab cab4 = iCabService.registerCab(driver4);
        Cab cab5 = iCabService.registerCab(driver5);

        Ride ride = iCabService.bookCab(rider, new Location(200, 200));
        Thread.sleep(3000);
        iRideService.endTrip(ride);


        Ride ride2 = iCabService.bookCab(rider, new Location(700, 2));
        Thread.sleep(4000);
        iRideService.endTrip(ride2);


        iRiderService.getRiderHistory(rider.getName());

    }
}
