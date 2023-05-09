package services

import infrastructures.ReservationInfrastructuresInterface
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput

interface ReservationServiceInterface {
    val reservationInfrastructure: ReservationInfrastructuresInterface

    fun persistReservation(reservationInput: ReservationInput): Reservation
}
