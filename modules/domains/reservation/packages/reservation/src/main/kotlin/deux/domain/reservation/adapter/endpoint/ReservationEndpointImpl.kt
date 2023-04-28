package deux.domain.reservation.adapter.endpoint

import deux.domain.reservation.domain.CreateReservationUseCase
import deux.domain.reservation.domain.ReservationEndpoint
import deux.domain.reservation.model.Reservation
import deux.domain.reservation.model.ReservationInput
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/reservation")
class ReservationEndpointImpl(
    private val createReservationUseCase: CreateReservationUseCase,
) : ReservationEndpoint {

    @GetMapping("/{name}")
    fun greeting(@PathVariable name: String): String {
        return "Hello $name"
    }

    @PostMapping("/")
    override fun create(@RequestBody() reservation: ReservationInput): Reservation {
        return createReservationUseCase.execute(reservation)
    }
}
