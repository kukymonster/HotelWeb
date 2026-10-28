package unideb.hu.hotelWeb.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "szoba")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SzobaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "szobaszam", nullable = false, length = 3)
    private int szobaszam;

    @Column(name = "leiras")
    private String leiras;

    @Column(name = "maxFerohely", nullable = false)
    private int maxFerohely;

    @Column(name = "meret", nullable = false)
    private int meret;

    @Column(name = "alapAr", nullable = false)
    private int alapAr;
}
