plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.serialization") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlinSerialization)
    implementation(libs.ktorSerializationKotlinxJson)
}

group = "deux.utils"
