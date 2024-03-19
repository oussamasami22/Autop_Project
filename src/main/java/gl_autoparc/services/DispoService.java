package gl_autoparc.services;


import gl_autoparc.entities.Trip;
import org.springframework.stereotype.Service;
import gl_autoparc.entities.Driver;
import java.util.List;
@Service
public interface DispoService {
    boolean isAvailable(Driver driver, Trip trip);
}
