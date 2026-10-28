package unideb.hu.hotelWeb.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unideb.hu.hotelWeb.data.entity.KepEntity;

@Repository
public interface KepRepository extends JpaRepository<KepEntity, Long> {
}
