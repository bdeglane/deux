plugins {
    id("deux.library-conventions")
    id("deux.kotlin-serialization-conventions")
    id("deux.kotlin-server-conventions")
}

group = "deux.reservation.app"

repositories {
    mavenCentral()
}

dependencies {
    implementation("deux.utils:uuid")
    implementation("deux.reservation.model:lib")

    testImplementation("deux.utils:uuid")
    testImplementation("deux.reservation.model:lib")
}
