package unideb.hu.hotelWeb.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kep")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KepEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "szoba_id", nullable = false)
    private SzobaEntity szobaId;

    @Column(name = "url", nullable = false)
    private String url;
}
