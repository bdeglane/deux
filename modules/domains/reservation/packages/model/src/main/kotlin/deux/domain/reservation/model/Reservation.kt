package deux.domain.reservation.model

interface ReservationInputInterface {
    val dateStart: String
    val duration: Int
    val pax: Int
}

class ReservationInput(
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInputInterface

interface ReservationInterface : ReservationInputInterface {
    val uuid: String
}

data class Reservation(
    override val uuid: String,
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInterface {

    fun getEndDate(): String {
        return this.dateStart
    }
}
