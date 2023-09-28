plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.ktorClientCore)
    implementation(libs.ktorClientCio)
}

group = "deux.utils"
