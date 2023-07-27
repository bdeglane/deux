package deux.reservation

import deux.reservation.domain.primary.ReservationEndpoint
import deux.reservation.model.Reservation
import deux.reservation.model.ReservationInput
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import org.koin.ktor.ext.inject

fun Route.reservation() {
    val reservationEndpoint by inject<ReservationEndpoint>()

    route("/api/v1/reservation") {

        get("/{name}") {
            val name = call.parameters["name"]
            val result = reservationEndpoint.greeting(name = name ?: "unknown")
            call.respondText(result)
        }

        post("/") {
            val reservationInput = call.receive<ReservationInput>()
            val result = reservationEndpoint.create(reservationInput)

            call.respond(result)
        }

        get("/{uuid}") {
            val uuid = call.parameters["uuid"]
            val reservations = reservationEndpoint.getByUUID(uuid!!)

            call.respond(reservations ?: emptyList<Reservation>())
        }
    }
}
