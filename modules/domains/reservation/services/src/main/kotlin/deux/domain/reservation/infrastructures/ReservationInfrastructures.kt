package deux.domain.reservation.infrastructures

import deux.domain.reservation.Reservation
import deux.domain.reservation.ReservationInput

interface ReservationInfrastructures {
    fun persistReservation(input: ReservationInput): Reservation
}
