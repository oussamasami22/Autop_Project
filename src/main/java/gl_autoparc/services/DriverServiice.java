package gl_autoparc.services;

import org.springframework.stereotype.Service;
import gl_autoparc.entities.Driver;
import java.util.List;
@Service
public interface DriverServiice {
    List<Driver> getAllDrivers();
    Driver getDriverById(Long id);
    void addDriver(Driver driver);
    void updateDriver(Long id, Driver updatedDriver);
    void deleteDriver(Long id);
}
