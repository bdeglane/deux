package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface CreateReservationUseCase {
    fun execute(reservationInput: ReservationInput): Reservation
}
