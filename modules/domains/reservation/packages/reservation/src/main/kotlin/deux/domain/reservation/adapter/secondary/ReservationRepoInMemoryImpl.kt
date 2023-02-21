package deux.domain.reservation.adapter.secondary

import deux.domain.reservation.domain.secondary.ReservationRepo
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import uuid.getUUID


class ReservationRepoInMemoryImpl : ReservationRepo {
    private val reservations = mutableMapOf<String, ReservationDB>()

    override fun persist(reservationInput: ReservationInput): Reservation {
        val reservation = ReservationDB(
            uuid = getUUID(),
            dateStart = reservationInput.dateStart,
            duration = reservationInput.duration,
            pax = reservationInput.pax
        )

        reservations.put(reservation.uuid, reservation)

        return reservation.toReservationModel()
    }

    override fun getByUUID(uuid: String): Reservation? {
        val reservationDB = reservations.get(uuid)

        if (reservationDB != null) {
            return reservationDB.toReservationModel()
        }

        return null
    }
}
