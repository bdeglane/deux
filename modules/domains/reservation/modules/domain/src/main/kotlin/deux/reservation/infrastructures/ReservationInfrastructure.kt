package deux.reservation.infrastructures

import deux.reservation.Reservation
import deux.reservation.ReservationInput

interface ReservationInfrastructure {
    fun persist(input: ReservationInput): Reservation
    fun getById(id: String): Reservation ?
}
