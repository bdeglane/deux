package deux.domain.reservation.domain.usecase

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface CreateReservationUseCase {
    fun execute(reservationInput: ReservationInput): Reservation
}
