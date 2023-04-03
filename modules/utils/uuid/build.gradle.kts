plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

group = "deux.utils"

dependencies {
    testImplementation("junit:junit:4.13.1")
    // testImplementation("io.kotest:kotest-assertions-core")
}
