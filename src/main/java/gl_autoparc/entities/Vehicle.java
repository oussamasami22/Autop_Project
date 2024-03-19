package gl_autoparc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vehicule")
public class Vehicle {
    @Id
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "year", nullable = false)
    private Integer year;
    @Enumerated(EnumType.STRING)
    @Column(name = "vehicle_type", nullable = false)
    private DriverLicenseType type;
    @Enumerated(EnumType.STRING)
    @Column(name = "VehiculeType" ,nullable = false)
    private VehiculeType typeVehicule;
    @OneToOne
    @JoinColumn(name = "gris_card_id")
    private GrisCard grisCard;
    @OneToOne
    @JoinColumn(name = "insurance_id")
    private VehicleInsurance vehicleInsurance;
    @OneToOne
    @JoinColumn(name = "vignette_id")
    private Vignette vignette;
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private Set<TechnicalVisit> technicalVisits;
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private Set<Trip> tripSet = new HashSet<>();

}
