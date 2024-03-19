package gl_autoparc.services;
import gl_autoparc.entities.Trip;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TripService {
    List<Trip> getAllTrips();
    Trip getTripById(Long id);
    void addTrip(Trip trip);
    void updateTrip(Long id, Trip updatedTrip);
    void deleteTrip(Long id);

}
