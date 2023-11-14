plugins {
    id("deux.library-conventions")
    id("deux.kotlin-server-conventions")
    id("deux.kotlin-serialization-conventions")
}

group = "deux.reservation.model"


dependencies {
    implementation("deux.utils:date")
}
