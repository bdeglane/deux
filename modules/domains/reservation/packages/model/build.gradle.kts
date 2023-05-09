plugins {
    kotlin("jvm") version "1.8.10"
    // application
}

repositories {
    mavenCentral()
}

// group = "deux.domain.reservation"

tasks.jar {
    enabled = true
}
