package unideb.hu.hotelWeb.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unideb.hu.hotelWeb.data.entity.enums.FoglalasStatusz;

import java.time.LocalDate;

@Entity
@Table(name = "foglalas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoglalasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "erkezes", nullable = false)
    private LocalDate erkezes;

    @Column(name = "tavozas", nullable = false)
    private LocalDate tavozas;

    @Column(name = "foglalasDatum", nullable = false)
    private LocalDate foglalasDatum;

    @Column(name = "vegosszeg", nullable = false)
    private int vegosszeg;

    @Column(name = "statusz", nullable = false)
    private FoglalasStatusz statusz;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vendeg_id", nullable = false)
    private VendegEntity vendegId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "szoba_id", nullable = false)
    private SzobaEntity szobaId;
}
