package deux.reservation.domain

import deux.reservation.Reservation
import deux.reservation.endpoints.CreateReservationBody

interface ReservationEndpoint {
    fun createReservation(body: CreateReservationBody): Reservation
    fun get(id: String): Reservation ?
}
