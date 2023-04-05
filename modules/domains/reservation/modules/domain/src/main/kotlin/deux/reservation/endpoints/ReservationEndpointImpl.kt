package deux.reservation.endpoints

import deux.reservation.Reservation
import deux.reservation.domain.ReservationEndpoint
import deux.reservation.usecases.CreateReservationUseCaseImpl
import deux.reservation.usecases.GetReservationUseCaseImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/reservation")
class ReservationEndpointImpl(
    private val createReservationUseCaseImpl: CreateReservationUseCaseImpl,
    private val getReservationUseCaseImpl: GetReservationUseCaseImpl,
) : ReservationEndpoint {

    @PostMapping("/")
    override fun createReservation(@RequestBody body: CreateReservationBody): Reservation {
        return this.createReservationUseCaseImpl.execute(createReservationBodyToReservationInput(body))
    }

    @GetMapping("/{id}")
    override fun get(@PathVariable id: String): Reservation ? {
        return this.getReservationUseCaseImpl.execute(id)
    }
}
