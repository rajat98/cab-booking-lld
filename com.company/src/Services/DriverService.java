package Services;

import Entities.Driver;
import Enums.DriverStatus;

import java.util.HashMap;
import java.util.Map;

public class DriverService implements IDriverService{
    private Map<String, Driver> driverMap = new HashMap<>();

    @Override
    public Driver registerDriver(String name) {
        Driver driver = new Driver(name);
        driverMap.put(name, driver);
        System.out.printf("New Driver registered successfully name: %s id: %d status: %s\n", driver.getName(), driver.getId(), driver.getDriverStatus().name());
        return driver;
    }

    @Override
    public void updateStatus(String driverName, DriverStatus driverStatus) {
        Driver driver = driverMap.get(driverName);
        DriverStatus oldStatus = driver.getDriverStatus();
        driver.setDriverStatus(driverStatus);
        System.out.printf("Driver status successfully updated name: %s oldStatus: %s newStatus: %s", driver.getName(), oldStatus,driver.getDriverStatus().name());

    }
}
