package deux.domain.reservation.adapter.repository

import deux.domain.reservation.domain.ReservationRepo
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import org.springframework.stereotype.Component
import uuid.getUUID

@Component
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
