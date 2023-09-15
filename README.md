# Cab Booking System - Design Patterns

This is a Java project for a Cab Booking System that demonstrates the use of design patterns in software development. The project defines a set of interfaces and contracts for various services involved in the cab booking system.

## Project Structure

The project is organized into several service interfaces, each responsible for a specific aspect of the cab booking system:

### ICabFindingStrategy

- Interface for finding an available cab based on a rider's request and location.
- Method: `findCab(Rider rider, Location location, List<Cab> cabList)` - Finds and returns a suitable cab for the rider.

### ICabService

- Interface for managing cab-related operations.
- Methods:
  - `registerCab(Driver driver)` - Registers a new cab with the system and associates it with a driver.
  - `bookCab(Rider rider, Location destination)` - Books a cab for a rider to a specified destination.
  - `updateCabLocation(Cab cab, Location newLocation)` - Updates the location of a cab.

### ICostStrategy

- Interface for calculating the cost of a ride.
- Method: `getTripCost(Ride ride)` - Calculates and returns the cost of a ride based on various factors.

### IDriverService

- Interface for driver-related operations.
- Methods:
  - `registerDriver(String name)` - Registers a new driver with the system.
  - `updateStatus(String driver, DriverStatus driverStatus)` - Updates the status of a driver.

### IRiderService

- Interface for rider-related operations.
- Methods:
  - `registerRider(String name)` - Registers a new rider with the system.
  - `getRiderHistory(String name)` - Retrieves the ride history for a rider.
  - `updateRiderHistoryMap(String name, Ride ride)` - Updates the rider's ride history.

### IRideService

- Interface for managing ride-related operations.
- Method: `endTrip(Ride ride)` - Marks the end of a ride and calculates the final trip cost.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
