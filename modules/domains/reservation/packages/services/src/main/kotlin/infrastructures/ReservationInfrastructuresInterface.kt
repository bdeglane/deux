package infrastructures

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationInfrastructuresInterface {
    fun persistReservation(input: ReservationInput): Reservation
}
