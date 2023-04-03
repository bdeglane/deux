package deux.reservation.usecases

import deux.reservation.Reservation
import deux.reservation.infrastructures.ReservationInfrastructure
import org.springframework.stereotype.Service

@Service
class GetReservationUseCaseImpl(
    private val reservationInfrastructure: ReservationInfrastructure
) : GetReservationUseCase {
    override fun execute(id: String): Reservation ? {
        return this.reservationInfrastructure.getById(id)
    }
}
