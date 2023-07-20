package deux.reservation.adapter.primary

import deux.reservation.domain.usecase.GetReservationUseCase
import deux.reservation.domain.usecase.CreateReservationUseCase
import deux.reservation.primary.ReservationEndpoint
import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput

const val url = "/api/v1/reservation"

class ReservationEndpointImpl(
    private val createReservationUseCase: CreateReservationUseCase,
    private val getReservationUseCase: GetReservationUseCase
) : ReservationEndpoint {

    // @GetMapping("/{name}")
    fun greeting(name: String): String {
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
