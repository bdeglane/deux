package deux.domain.reservation.model

data class ReservationInput(
    val dateStart: String,
    val duration: Int,
    val pax: Int,
)

data class Reservation(
    val uuid: String,
    val dateStart: String,
    val duration: Int,
    val pax: Int,
) {

    fun getEndDate(): String {
        return this.dateStart
    }
}
