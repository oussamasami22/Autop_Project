package gl_autoparc.repositories;
 import gl_autoparc.entities.GrisCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrisCardRepository extends JpaRepository<GrisCard, Long> {
}