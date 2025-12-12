// ChatRepository.java
package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.ChatItinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<ChatItinerario, Long> {
    List<ChatItinerario> findByItinerarioId(Long itinerarioId);
    List<ChatItinerario> findByItinerarioIdOrderByCreatedAtDesc(Long itinerarioId);
    List<ChatItinerario> findByItinerarioIdOrderByCreatedAtAsc(Long itinerarioId);
    List<ChatItinerario> findByUsuarioId(Long usuarioId);
}