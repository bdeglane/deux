package infrastructures

import model.Reservation
import model.ReservationInput
import uuid.getUUID

class ReservationInfrastructure() : ReservationInfrastructuresInterface {
    override fun persistReservation(input: ReservationInput): Reservation {
        val uuid = getUUID()

        return Reservation(input.dateStart, input.duration, input.pax, uuid)
    }
}
