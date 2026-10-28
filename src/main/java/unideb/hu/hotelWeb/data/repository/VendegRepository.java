package unideb.hu.hotelWeb.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unideb.hu.hotelWeb.data.entity.VendegEntity;

@Repository
public interface VendegRepository extends JpaRepository<VendegEntity, Long> {
}
