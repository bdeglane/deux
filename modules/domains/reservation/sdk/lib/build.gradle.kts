plugins {
    id("deux.library-conventions")
}

group = "deux.reservation.sdk"

repositories {
    mavenCentral()
}

dependencies {
    implementation("deux.reservation.model:lib")
    implementation("deux.utils:client")
    implementation("deux.utils:env")

    testImplementation("deux.reservation.model:lib")
    testImplementation("deux.utils:client")
    testImplementation("deux.utils:env")
}
