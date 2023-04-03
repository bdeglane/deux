package deux.reservation.usecases

import deux.reservation.Reservation

interface GetReservationUseCase {
    fun execute(id: String): Reservation ?
}
