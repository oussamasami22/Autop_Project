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
@Table(name = "trip")
public class Trip {
    @Id
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    @Column(name = "startDate", nullable = false)
    private LocalDateTime startDate; //date_depart
    @Column(name = "endDate", nullable = false)
    private LocalDateTime endDate; //date_arrivee
    @Column(name = "start_trip", nullable = false)
    private String startTrip; //heure_depart
    @Column(name = "end_trip", nullable = false)
    private String endTrip; //heure_arrivee
    @Enumerated(EnumType.STRING)
    @Column(name = "vehicle_type", nullable = false)
    private DriverLicenseType type;
    private String status;
    }