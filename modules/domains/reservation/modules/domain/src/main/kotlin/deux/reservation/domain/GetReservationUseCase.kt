package deux.reservation.domain

import deux.reservation.Reservation

interface GetReservationUseCase {
    fun execute(id: String): Reservation ?
}
