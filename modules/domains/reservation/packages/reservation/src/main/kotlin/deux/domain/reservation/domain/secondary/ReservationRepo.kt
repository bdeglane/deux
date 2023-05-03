package deux.domain.reservation.domain.secondary

import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationRepo {
    fun persist(reservationInput: ReservationInput): Reservation
    fun getByUUID(uuid: String): Reservation?
}
