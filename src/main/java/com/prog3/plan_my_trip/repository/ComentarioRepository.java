// ComentarioRepository.java
package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.ComentarioActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ComentarioRepository extends JpaRepository<ComentarioActividad, Long> {
    List<ComentarioActividad> findByActividadId(Long actividadId);
    List<ComentarioActividad> findByUsuarioId(Long usuarioId);
    List<ComentarioActividad> findByActividadIdOrderByCreatedAtDesc(Long actividadId);
}