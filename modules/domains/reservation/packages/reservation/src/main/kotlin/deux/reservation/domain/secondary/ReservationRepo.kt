package deux.reservation.domain.secondary

import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput

interface ReservationRepo {
    fun persist(reservationInput: ReservationInput): Reservation
    fun getByUUID(uuid: String): Reservation?
}
