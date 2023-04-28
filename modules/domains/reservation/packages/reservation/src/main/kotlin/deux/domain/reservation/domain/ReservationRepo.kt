package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationRepo {
    fun persist(reservationInput: ReservationInput): Reservation
}