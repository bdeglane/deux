package reservation.app.controllers

import endpoints.ReservationEndpoint
import model.Reservation
import model.ReservationInput
import model.ReservationInputInterface
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class CreateReservationBody(
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInputInterface

@RestController
@RequestMapping("/api/v1/reservation")
class ReservationController(val reservationEndpoint: ReservationEndpoint) {

    @GetMapping("/{name}")
    fun greeting(@PathVariable name: String): String {
        return "Hello $name"
    }

    @PostMapping("/")
    fun createReservation(@RequestBody body: CreateReservationBody): Reservation {

        val reservationInput = ReservationInput(
            body.dateStart,
            body.duration,
            body.pax,
        )

        return this.reservationEndpoint.createReservation(reservationInput)
    }
}
