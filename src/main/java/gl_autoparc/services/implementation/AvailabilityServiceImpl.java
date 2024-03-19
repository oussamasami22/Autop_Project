package gl_autoparc.services.implementation;

import gl_autoparc.services.AvailabilityService;

import java.time.LocalDateTime;


public class AvailabilityServiceImpl implements AvailabilityService {
    @Override
    public boolean isAvailableDriver(String driverId, LocalDateTime start, LocalDateTime end) {
        return false;
    }

    @Override
    public boolean isAvailableVehicle(String vehicleId, LocalDateTime start, LocalDateTime end) {
        return false;
    }
}
