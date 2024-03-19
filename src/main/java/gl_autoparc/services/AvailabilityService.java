package gl_autoparc.services;

import java.time.LocalDateTime;

public interface AvailabilityService {
    boolean isAvailableDriver(String driverId, LocalDateTime start, LocalDateTime end);
    boolean isAvailableVehicle(String vehicleId, LocalDateTime start, LocalDateTime end);
}
