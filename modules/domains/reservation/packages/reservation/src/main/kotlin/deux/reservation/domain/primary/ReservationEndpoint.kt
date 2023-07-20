package deux.reservation.primary

import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput

interface ReservationEndpoint {
    fun create(reservation: ReservationInput): Reservation

    fun getByUUID(uuid: String): Reservation?
}
