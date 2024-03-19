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
    @Table(name = "vacation")
    public class Vocation {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "start_vacation", nullable = false)
        private LocalDateTime start;
        @Column(name = "end_vacation", nullable = false)
        private LocalDateTime end;
        @ManyToOne
        @JoinColumn(name = "driver_id")
        private Driver driver;
    }