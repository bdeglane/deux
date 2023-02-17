package endpoints

import model.Reservation
import model.ReservationInput
import services.ReservationServiceInterface

interface ReservationEndpointInterface {
    val reservationService: ReservationServiceInterface

    fun createReservation(input: ReservationInput): Reservation
}
