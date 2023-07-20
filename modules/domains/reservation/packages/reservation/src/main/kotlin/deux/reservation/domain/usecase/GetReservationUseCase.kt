package deux.reservation.domain.usecase

import deux.reservation.model.Reservation

interface GetReservationUseCase {
    fun byUUID(uuid: String): Reservation?
}
