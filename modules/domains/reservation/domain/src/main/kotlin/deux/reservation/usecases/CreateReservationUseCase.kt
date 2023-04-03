package deux.reservation.usecases

import deux.reservation.Reservation
import deux.reservation.ReservationInput

interface CreateReservationUseCase {
    fun execute(input: ReservationInput): Reservation
}
