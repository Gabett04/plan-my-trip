package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {
    List<Actividad> findByItinerarioId(Long itinerarioId);
    List<Actividad> findByItinerarioIdOrderByFechaHoraInicio(Long itinerarioId);
}