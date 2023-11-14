package deux.reservation.sdk

import deux.reservation.model.ReservationInput
import deux.utils.client.createClient
import deux.utils.env.ENV_VAR
import deux.utils.env.getEnvVar
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse

class ReservationClient {
    private val url: String = getEnvVar(ENV_VAR.API_RESERVATION)
    private val client: HttpClient = createClient()

    suspend fun createReservation(body: ReservationInput): HttpResponse {
        return client.post(url).body()
    }
}
