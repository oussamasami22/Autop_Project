package gl_autoparc.repositories;

import gl_autoparc.entities.Vignette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VignetteRepository extends JpaRepository<Vignette, Long> {
}