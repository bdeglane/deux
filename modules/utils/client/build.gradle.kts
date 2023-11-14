plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.ktorClientCore)
    api(libs.ktorClientCio)
    api(libs.ktorClientOkhttp)
}

group = "deux.utils"
