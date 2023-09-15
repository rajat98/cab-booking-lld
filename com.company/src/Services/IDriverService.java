package Services;

import Entities.Driver;
import Enums.DriverStatus;

public interface IDriverService {
    public Driver registerDriver(String name);
    public void updateStatus(String driver, DriverStatus driverStatus);
}
