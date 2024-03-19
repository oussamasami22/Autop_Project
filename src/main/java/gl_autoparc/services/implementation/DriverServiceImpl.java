package gl_autoparc.services.implementation;

import gl_autoparc.entities.Driver;
import gl_autoparc.services.DriverServiice;

import java.util.List;

public class DriverServiceImpl  implements DriverServiice {
    @Override
    public List<Driver> getAllDrivers() {
        return null;
    }

    @Override
    public Driver getDriverById(Long id) {
        return null;
    }

    @Override
    public void addDriver(Driver driver) {

    }

    @Override
    public void updateDriver(Long id, Driver updatedDriver) {

    }

    @Override
    public void deleteDriver(Long id) {

    }
    // private final DriverRepository driverRepository;
    //    public DriverServiceImpl(DriverRepository driverRepository){
    //        this.driverRepository=driverRepository;
    //    }
    //    @Override
    //    public List<Driver> getAllDrivers() {
    //        return driverRepository.findAll();
    //    }
    //
    //    @Override
    //    public Driver getDriverById(Long id) {
    //        return driverRepository.findById(String.valueOf(id)).orElse(null);
    //    }
    //
    //    @Override
    //    public void addDriver(Driver driver) {
    // driverRepository.save(driver);
    //    }
    //
    //    @Override
    //    public void updateDriver(Long id, Driver updatedDriver) {
    //
    //    }
    //
    //    @Override
    //    public void deleteDriver(Long id) {
    //  driverRepository.deleteById(String.valueOf(id));
    //    }
}
