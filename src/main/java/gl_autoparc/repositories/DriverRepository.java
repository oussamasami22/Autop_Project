package gl_autoparc.repositories;
import gl_autoparc.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, String> {

}