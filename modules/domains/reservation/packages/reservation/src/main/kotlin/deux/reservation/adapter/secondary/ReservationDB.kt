package deux.reservation.adapter.secondary

import deux.reservation.model.Reservation

class ReservationDB(
    val uuid: String,
    val dateStart: String,
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


