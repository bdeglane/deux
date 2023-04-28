package endpoints

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import services.ReservationServiceInterface

class ReservationEndpoint(
    override val reservationService: ReservationServiceInterface,
) : ReservationEndpointInterface {
    override fun createReservation(input: ReservationInput): Reservation {
        // validate payload
        println("validate payload")

        return this.reservationService.persistReservation(input)
    }
}
