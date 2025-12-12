// DestinoRepository.java
package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {
    List<Destino> findByPais(String pais);
    List<Destino> findByCiudad(String ciudad);
    List<Destino> findByPaisAndCiudad(String pais, String ciudad);
}