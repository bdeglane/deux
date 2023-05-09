package deux.domain.reservation.domain.primary

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationEndpoint {
    fun create(reservation: ReservationInput): Reservation

    fun getByUUID(uuid: String): Reservation?
}
