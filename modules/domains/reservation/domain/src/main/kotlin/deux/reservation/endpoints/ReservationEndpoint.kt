package deux.reservation.endpoints

import deux.reservation.Reservation

interface ReservationEndpoint {
    fun createReservation(body: CreateReservationBody): Reservation
    fun get(id: String): Reservation ?
}
