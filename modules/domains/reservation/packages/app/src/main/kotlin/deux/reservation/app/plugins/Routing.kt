package deux.reservation.app.plugins

import deux.reservation.domain.primary.ReservationEndpoint
import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    routing {
        reservation()

        get("/"){
            call.respondText("hello")
        }
    }
}

fun Route.reservation() {
    val reservationEndpoint by inject<ReservationEndpoint>()

    route("/reservation") {

        get("/{name}") {
            val name = call.parameters["name"]
            println("reservationEndpoint $reservationEndpoint")
            println("name $name")
            val result = reservationEndpoint.greeting(name = name ?: "unknown")
            println("result $result")
            call.respondText(result)
        }
    }
}
