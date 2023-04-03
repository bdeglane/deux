package deux.domain.reservation

interface ReservationInputInterface {
    val dateStart: String
    val duration: Int
    val pax: Int
}

interface ReservationInterface {
    val uuid: String
}

open class ReservationInput(
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInputInterface

data class Reservation(
    override val uuid: String,
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInput(dateStart, duration, pax), ReservationInterface {

    fun getEndDate(): String {
        return this.dateStart
    }
}
