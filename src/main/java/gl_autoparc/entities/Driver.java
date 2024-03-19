package gl_autoparc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "cin")
    private String cin;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy = "driver", fetch = FetchType.EAGER)
    private Set<DriverLicense> driverLicenses;
    @OneToMany(mappedBy = "driver", orphanRemoval = true, cascade = CascadeType.ALL)
    /*orphanRemoval = true : Cela signifie que lorsque des instances de Vacation
    ne sont plus référencées par un conducteur, elles seront automatiquement supprimées
    de la base de données.*/
    private Set<Vocation> vacations;
    @OneToMany(mappedBy = "driver"  , fetch = FetchType.LAZY)
    private Set<Trip> tripSet;
}
