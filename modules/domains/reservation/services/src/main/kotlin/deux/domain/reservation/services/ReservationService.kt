package deux.domain.reservation.services

import deux.domain.reservation.Reservation
import deux.domain.reservation.ReservationInput

interface ReservationService {
    fun persistReservation(reservationInput: ReservationInput): Reservation
}
