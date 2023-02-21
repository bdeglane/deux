plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

group = "deux.domains.reservation"

dependencies {
    implementation(project(":model"))
    implementation("deux.utils:uuid")
}
