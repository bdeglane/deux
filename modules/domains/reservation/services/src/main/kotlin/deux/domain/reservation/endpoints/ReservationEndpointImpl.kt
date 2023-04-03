package deux.domain.reservation.endpoints

import deux.domain.reservation.Reservation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import deux.domain.reservation.services.ReservationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/api/v1/reservation")
class ReservationEndpointImpl(
    val reservationService: ReservationService,
) : ReservationEndpoint {

    @PostMapping("/")
    override fun createReservation(@RequestBody body: CreateReservationBody): Reservation {

        return this.reservationService.persistReservation(createReservationBodyToReservationInput(body))
    }
}
