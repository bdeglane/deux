package deux.reservation.adapter.primary

import deux.reservation.domain.usecase.GetReservationUseCase
import deux.reservation.domain.usecase.CreateReservationUseCase
import deux.reservation.domain.primary.ReservationEndpoint
import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput
// import io.ktor.server.routing.Route
// import io.ktor.server.routing.get

const val url = "/api/v1/reservation"

// fun Route.greeting() {
//     get("/hello/{name}") {
//
//     }
// }

class ReservationEndpointImpl(
    private val createReservationUseCase: CreateReservationUseCase,
    private val getReservationUseCase: GetReservationUseCase
) : ReservationEndpoint {

    // @GetMapping("/{name}")
    override fun greeting(name: String): String {
        return "Hello $name"
    }

    // @PostMapping("/")
    override fun create(reservation: ReservationInput): Reservation {
        return createReservationUseCase.execute(reservation)
    }

    // @GetMapping("/{uuid}")
    override fun getByUUID(uuid: String): Reservation? {
        return getReservationUseCase.byUUID(uuid)
    }
}
