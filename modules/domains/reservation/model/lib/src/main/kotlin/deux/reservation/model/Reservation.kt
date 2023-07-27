package deux.reservation.model

import deux.utils.date.KOffsetDateTimeSerializer
import kotlinx.serialization.Serializable
import java.time.OffsetDateTime

sealed class ReservationBase {
    abstract val dateStart: OffsetDateTime
    abstract val duration: Int
    abstract val pax: Int
}

@Serializable
data class ReservationInput(
    @Serializable(KOffsetDateTimeSerializer::class)
    override val dateStart: OffsetDateTime,
    override val duration: Int,
    override val pax: Int
) : ReservationBase()

@Serializable
data class Reservation(
    val uuid: String,
    @Serializable(KOffsetDateTimeSerializer::class)
    override val dateStart: OffsetDateTime,
    override val duration: Int,
    override val pax: Int,
) : ReservationBase() {

    fun getEndDate(): String {
        return this.dateStart.toString()
    }
}
