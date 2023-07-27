package deux.reservation.adapter.secondary

import deux.reservation.model.Reservation
import java.time.OffsetDateTime

class ReservationDB(
    val uuid: String,
    val dateStart: OffsetDateTime,
    val duration: Int,
    val pax: Int,
)

fun ReservationDB.toReservationModel() = Reservation(
    uuid = uuid,
    dateStart = dateStart,
    duration = duration,
    pax = pax
)

fun Reservation.toReservationDB() = ReservationDB(
    uuid = uuid,
    dateStart = dateStart,
    duration = duration,
    pax = pax
)
