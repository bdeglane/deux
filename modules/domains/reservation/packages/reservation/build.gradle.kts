plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("deux.utils:uuid")
    implementation("deux.reservation.model:lib")

    testImplementation("deux.reservation.model:lib")

    testImplementation(libs.kotlinTestJunit5)
    testImplementation(libs.junitJupiterEngine)
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
