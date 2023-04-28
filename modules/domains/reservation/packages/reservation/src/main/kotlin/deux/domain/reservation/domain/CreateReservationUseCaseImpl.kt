package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput


class CreateReservationUseCaseImpl (
    private val reservationRepo: ReservationRepo
) : CreateReservationUseCase {
    override fun execute(reservationInput: ReservationInput): Reservation {
        return reservationRepo.persist(reservationInput)
    }
}
