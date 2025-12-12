package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario, Long> {
    List<Itinerario> findByUsuarioId(Long usuarioId);
    List<Itinerario> findByUsuarioIdOrderByFechaInicioDesc(Long usuarioId);
}