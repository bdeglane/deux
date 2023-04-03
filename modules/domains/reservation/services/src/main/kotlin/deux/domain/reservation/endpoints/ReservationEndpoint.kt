package deux.domain.reservation.endpoints

import deux.domain.reservation.Reservation
import deux.domain.reservation.endpoints.CreateReservationBody

interface ReservationEndpoint {
    fun createReservation(body: CreateReservationBody): Reservation
}
