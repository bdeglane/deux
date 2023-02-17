package model

interface ReservationInput {
    val dateStart: String
    val duration: Int
    val pax: Int
}

interface ReservationInterface {
    val uuid: String
}

data class Reservation(
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
    override val uuid: String,
) : ReservationInput, ReservationInterface {

    fun getEndDate(): String {
        return this.dateStart
    }
}
