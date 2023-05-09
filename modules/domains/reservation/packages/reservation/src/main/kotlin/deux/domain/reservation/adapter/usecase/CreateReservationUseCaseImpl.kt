package deux.domain.reservation.adapter.usecase

import deux.domain.reservation.domain.secondary.ReservationRepo
import deux.domain.reservation.domain.usecase.CreateReservationUseCase
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import org.springframework.stereotype.Component

@Component
class CreateReservationUseCaseImpl (
    private val reservationRepo: ReservationRepo
) : CreateReservationUseCase {
    override fun execute(reservationInput: ReservationInput): Reservation {
        return reservationRepo.persist(reservationInput)
    }
}
