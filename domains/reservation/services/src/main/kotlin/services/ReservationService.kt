package services

import infrastructures.ReservationInfrastructuresInterface
import model.Reservation
import model.ReservationInput

class ReservationService(
    override val reservationInfrastructure: ReservationInfrastructuresInterface,
) : ReservationServiceInterface {
    override fun persistReservation(reservationInput: ReservationInput): Reservation {
        return this.persistReservation(reservationInput)
    }
}
