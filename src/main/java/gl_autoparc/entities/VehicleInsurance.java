package gl_autoparc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Entity
    @Table(name = "vehicle_insurance")
    public class VehicleInsurance {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "activated_date", nullable = false)
        private LocalDate activatedDate;
        @Column(name = "end_date", nullable = false)
        private LocalDate endDate;
        @Enumerated(EnumType.STRING)
        private InsuranceDuration duration;
    }


