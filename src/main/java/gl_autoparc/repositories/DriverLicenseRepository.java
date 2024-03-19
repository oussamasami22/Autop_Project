package gl_autoparc.repositories;

import gl_autoparc.entities.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverLicenseRepository extends JpaRepository<DriverLicense, Long> {

}