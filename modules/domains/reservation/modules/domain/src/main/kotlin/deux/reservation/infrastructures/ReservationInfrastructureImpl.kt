package deux.reservation.infrastructures

import deux.reservation.Reservation
import deux.reservation.ReservationInput
import org.springframework.stereotype.Service
import uuid.getUUID

@Service
class ReservationInfrastructureImplInMemory : ReservationInfrastructure {
    val reservations = mutableMapOf<String, Reservation>()
    override fun persist(input: ReservationInput): Reservation {
        val uuid = getUUID()
        val reservation = Reservation(uuid, input.dateStart, input.duration, input.pax)
        this.reservations.set(uuid, reservation)

        return reservation
    }

    override fun getById(id: String): Reservation ? {
        return this.reservations.get(id)
    }
}
