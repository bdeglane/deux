package deux.utils.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO

class CreateHttpClient(
    val baseUrl: String,
) {
    val client = HttpClient(CIO)

    // init {
    //     val client = HttpClient(CIO)
    // }

    // suspend fun get(resource: String): HttpResponse = client.get("$baseUrl$resource")
    // suspend fun post(resource: String, body: ): HttpResponse = client.post("$baseUrl$resource")
}

fun createClient() = HttpClient(CIO)
