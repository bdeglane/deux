package deux.domain.reservation.domain.usecase

import deux.domain.reservation.model.Reservation

interface GetReservationUseCase {
    fun byUUID(uuid: String): Reservation?
}
