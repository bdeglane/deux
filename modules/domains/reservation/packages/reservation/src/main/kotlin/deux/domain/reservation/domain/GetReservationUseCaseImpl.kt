package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation
import org.springframework.stereotype.Component

@Component
class GetReservationUseCaseImpl(
    private val reservationRepo: ReservationRepo,
) : GetReservationUseCase {
    override fun byUUID(uuid: String): Reservation? {
        return reservationRepo.getByUUID(uuid)
    }
}
