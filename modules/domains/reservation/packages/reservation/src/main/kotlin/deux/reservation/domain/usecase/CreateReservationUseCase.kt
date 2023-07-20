package deux.reservation.domain.usecase

import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput

interface CreateReservationUseCase {
    fun execute(reservationInput: ReservationInput): Reservation
}
