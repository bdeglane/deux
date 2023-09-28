package deux.reservation.sdk

import deux.utils.client.CreateClient
import deux.utils.client.createClient

class ReservationClient {
    // private lateinit var client: CreateClient

    // init {
    //     val client = createClient()
    // }


    private val client = createClient()

    suspend fun createReservation() {
        // client.requestPipeline.
    }
}
