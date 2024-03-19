package gl_autoparc.entities;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Builder
@Entity
public class AttestationConformity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "att_id")
       private int id;
    @Column(name="num_att")
    private String num;
    @Column(name = "type_att")
    private String type;
    @Column(name = "details_att")
    private String details;

    @ManyToOne
    @JoinColumn(name="license_plate")
    private Vehicle vehicle;


}
