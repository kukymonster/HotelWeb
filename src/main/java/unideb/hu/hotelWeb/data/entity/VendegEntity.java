package unideb.hu.hotelWeb.data.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vendeg")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nev", nullable = false)
    private String nev;

    @Column(name = "iranyitoszam", nullable = false, length = 4)
    private int iranyitoszam;

    @Column(name = "varos", nullable = false)
    private String varos;

    @Column(name = "utca", nullable = false)
    private String utca;

    @Column(name = "hazszam", nullable = false, length = 3)
    private int hazszam;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefonszam", nullable = false, length = 11)
    private String telefonszam;
}
