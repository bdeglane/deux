package deux.domain.reservation.adapter

import deux.domain.reservation.domain.ReservationRepo
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import uuid.getUUID

class ReservationRepoInMemoryImpl : ReservationRepo {
    private val reservations = mutableMapOf<String, Reservation>()

    override fun persist(reservationInput: ReservationInput): Reservation {
        val reservation = Reservation(
            uuid = getUUID(),
            dateStart = reservationInput.dateStart,
            duration = reservationInput.duration,
            pax = reservationInput.pax
        )

        reservations.put(reservation.uuid, reservation)

        return reservation
    }
}
