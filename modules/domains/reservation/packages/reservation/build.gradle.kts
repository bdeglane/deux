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

    // testImplementation(platform("org.junit:junit-bom:5.9.3"))
    // testImplementation("org.junit.jupiter:junit-jupiter")
    // val version = "5.6.1"
    // testImplementation("io.kotest:kotest-runner-junit5:$version")
    // testImplementation("io.kotest:kotest-assertions-core:$version")
    // testImplementation("io.kotest:kotest-property:$version")

    // val version = "5.6.1"
    // testImplementation("io.kotest:kotest-runner-junit5:$version")
    // testImplementation("io.kotest:kotest-assertions-core:$version")
    // testImplementation("io.kotest:kotest-property:$version")

    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

// tasks.withType<Test>().configureEach {
//     useJUnitPlatform()
// }

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
