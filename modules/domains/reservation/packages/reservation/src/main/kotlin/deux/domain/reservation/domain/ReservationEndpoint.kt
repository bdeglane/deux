package deux.domain.reservation.domain

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationEndpoint {
    fun create(reservation: ReservationInput): Reservation

    fun getByUUID(uuid: String): Reservation?
}
