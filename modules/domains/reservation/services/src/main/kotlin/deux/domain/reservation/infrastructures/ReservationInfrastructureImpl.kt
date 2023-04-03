package deux.domain.reservation.infrastructures

import deux.domain.reservation.Reservation
import deux.domain.reservation.ReservationInput
import org.springframework.stereotype.Service
import uuid.getUUID

@Service
class ReservationInfrastructureImplInMemory : ReservationInfrastructures {
    val reservations = mutableListOf<Reservation>()
    override fun persistReservation(input: ReservationInput): Reservation {
        val uuid = getUUID()

        return Reservation(uuid, input.dateStart, input.duration, input.pax)
    }
}
