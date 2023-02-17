package services

import infrastructures.ReservationInfrastructuresInterface
import model.Reservation
import model.ReservationInput

interface ReservationServiceInterface {
    val reservationInfrastructure: ReservationInfrastructuresInterface

    fun persistReservation(reservationInput: ReservationInput): Reservation
}
