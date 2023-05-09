package endpoints

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import services.ReservationServiceInterface

interface ReservationEndpointInterface {
    val reservationService: ReservationServiceInterface

    fun createReservation(input: ReservationInput): Reservation
}
