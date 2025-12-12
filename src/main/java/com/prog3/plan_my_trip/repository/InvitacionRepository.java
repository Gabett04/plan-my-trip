// InvitacionRepository.java
package com.prog3.plan_my_trip.repository;

import com.prog3.plan_my_trip.entity.InvitacionItinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface InvitacionRepository extends JpaRepository<InvitacionItinerario, Long> {
    List<InvitacionItinerario> findByItinerarioId(Long itinerarioId);
    Optional<InvitacionItinerario> findByTokenAcceso(String tokenAcceso);
    List<InvitacionItinerario> findByEmailInvitado(String emailInvitado);
    List<InvitacionItinerario> findByEstado(InvitacionItinerario.Estado estado);
}