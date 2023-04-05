package deux.reservation.usecases

import deux.reservation.Reservation
import deux.reservation.domain.GetReservationUseCase
import deux.reservation.domain.ReservationInfrastructure
import org.springframework.stereotype.Service

@Service
class GetReservationUseCaseImpl(
    private val reservationInfrastructure: ReservationInfrastructure
) : GetReservationUseCase {
    override fun execute(id: String): Reservation ? {
        return this.reservationInfrastructure.getById(id)
    }
}
