package deux.reservation.adapter.usecase

import deux.reservation.domain.secondary.ReservationRepo
import deux.reservation.domain.usecase.CreateReservationUseCase
import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput

class CreateReservationUseCaseImpl(
    private val reservationRepo: ReservationRepo
) : CreateReservationUseCase {
    override fun execute(reservationInput: ReservationInput): Reservation {
        return reservationRepo.persist(reservationInput)
    }
}
