package deux.reservation.adapter.usecase

import deux.reservation.domain.secondary.ReservationRepo
import deux.reservation.domain.usecase.GetReservationUseCase
import deux.reservation.model.Reservation

class GetReservationUseCaseImpl(
    private val reservationRepo: ReservationRepo,
) : GetReservationUseCase {
    override fun byUUID(uuid: String): Reservation? {
        return reservationRepo.getByUUID(uuid)
    }
}
