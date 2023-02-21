package endpoints

import model.Reservation
import model.ReservationInput
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
