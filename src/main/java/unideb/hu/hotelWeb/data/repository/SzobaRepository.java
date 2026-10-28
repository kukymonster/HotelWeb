package unideb.hu.hotelWeb.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unideb.hu.hotelWeb.data.entity.SzobaEntity;

@Repository
public interface SzobaRepository extends JpaRepository<SzobaEntity, Long> {
}
