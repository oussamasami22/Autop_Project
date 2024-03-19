package gl_autoparc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "driver_license")
public class DriverLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "delivery_date", nullable = false)
    private LocalDateTime deliveryDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "license_type", nullable = false)
    private DriverLicenseType licenseType;
    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;
    public static final int expiryDate = 10;

}