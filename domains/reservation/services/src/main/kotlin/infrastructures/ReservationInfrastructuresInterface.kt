package infrastructures

import model.Reservation
import model.ReservationInput

interface ReservationInfrastructuresInterface {
    fun persistReservation(input: ReservationInput): Reservation
}
