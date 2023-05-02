package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation

interface GetReservationUseCase {
    fun byUUID(uuid: String): Reservation?
}
