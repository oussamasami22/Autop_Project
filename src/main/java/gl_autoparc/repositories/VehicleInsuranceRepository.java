package gl_autoparc.repositories;

import gl_autoparc.entities.VehicleInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInsuranceRepository extends JpaRepository<VehicleInsurance, Long> {
}
