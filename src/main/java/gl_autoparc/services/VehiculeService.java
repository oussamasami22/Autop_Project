package gl_autoparc.services;

import gl_autoparc.entities.Trip;
import gl_autoparc.entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface VehiculeService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    void addVehicle(Vehicle vehicle);
    void updateVehicle(Long id, Vehicle updatedVehicle);
    void deleteVehicle(Long id);

    Vehicle create(Vehicle vehicle);

    Vehicle getById(String vehicleId);

    Vehicle update(Vehicle vehicle, String vehicleId);

    boolean delete(String vehicleId);

    List<Vehicle> getAvailableVehicles(Trip trip);
    // Autres méthodes liées à la gestion des véhicules
}