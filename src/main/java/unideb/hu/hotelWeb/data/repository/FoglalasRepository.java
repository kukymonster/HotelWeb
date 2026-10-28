package unideb.hu.hotelWeb.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unideb.hu.hotelWeb.data.entity.FoglalasEntity;

@Repository
public interface FoglalasRepository extends JpaRepository<FoglalasEntity, Long> {

}
