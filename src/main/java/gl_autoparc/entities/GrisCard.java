package gl_autoparc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "gris_card")
public class GrisCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="activated_date", nullable = false)
      private LocalDate activatedDate;
    public static final int periodOfValidityInYears = 10;

}
