package gl_autoparc.services.implementation;

import gl_autoparc.entities.Trip;
import gl_autoparc.repositories.TripRepository;
import gl_autoparc.services.TripService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {
    private final TripRepository tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
       this.tripRepository = tripRepository;
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();

    }

    @Override
    public Trip getTripById(Long id) {
      return tripRepository.findById(id).orElse(null);

    }

    @Override
    public void addTrip(Trip trip) {
        tripRepository.save(trip);
    }

    @Override
    public void updateTrip(Long id, Trip updatedTrip) {
        Trip existingTrip = tripRepository.findById(id).orElse(null);
        if (existingTrip != null) {
            // Mettre à jour les propriétés du voyage existant avec celles du voyage mis à jour
            existingTrip.setDriver(updatedTrip.getDriver());
            existingTrip.setVehicle(updatedTrip.getVehicle());
            existingTrip.setStartDate(updatedTrip.getStartDate());
            existingTrip.setEndDate(updatedTrip.getEndDate());
            existingTrip.setStartTrip(updatedTrip.getStartTrip());
            existingTrip.setEndTrip(updatedTrip.getEndTrip());
            existingTrip.setType(updatedTrip.getType());
            existingTrip.setStatus(updatedTrip.getStatus());
            tripRepository.save(existingTrip);
        }

    }

    @Override
    public void deleteTrip(Long id) {
        CrudRepository<Trip, Long> tripRepository = null;
        tripRepository.deleteById(id);
    }
}