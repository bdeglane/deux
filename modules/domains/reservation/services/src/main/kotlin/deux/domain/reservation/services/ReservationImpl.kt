package deux.domain.reservation.services

import deux.domain.reservation.Reservation
import deux.domain.reservation.ReservationInput
import deux.domain.reservation.infrastructures.ReservationInfrastructures
import org.springframework.stereotype.Service

@Service
class ReservationImpl(
    val reservationInfrastructure: ReservationInfrastructures,
) : ReservationService {
    override fun persistReservation(reservationInput: ReservationInput): Reservation {
        return this.reservationInfrastructure.persistReservation(reservationInput)
    }
}
