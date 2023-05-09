package services

import infrastructures.ReservationInfrastructuresInterface
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

class ReservationService(
    override val reservationInfrastructure: ReservationInfrastructuresInterface,
) : ReservationServiceInterface {
    override fun persistReservation(reservationInput: ReservationInput): Reservation {
        return this.reservationInfrastructure.persistReservation(reservationInput)
    }
}
