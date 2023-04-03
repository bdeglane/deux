package deux.reservation.usecases

import deux.reservation.Reservation
import deux.reservation.ReservationInput
import deux.reservation.infrastructures.ReservationInfrastructure
import org.springframework.stereotype.Service

@Service
class CreateReservationUseCaseImpl(
    private val reservationInfrastructure: ReservationInfrastructure,
) : CreateReservationUseCase {
    override fun execute(input: ReservationInput): Reservation {
        return this.reservationInfrastructure.persist(input)
    }
}
