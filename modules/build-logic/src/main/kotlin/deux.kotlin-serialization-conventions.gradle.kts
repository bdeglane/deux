plugins {
    id("deux.library-conventions")
    // kotlin("plugin.serialization")
    // id("org.jetbrains.kotlin.plugin.serialization")
}

repositories {
    mavenCentral()
    // maven("https://mvnrepository.com")
}

dependencies {
    implementation(lib("kotlinSerialization"))
    // implementation(lib("ktorSerializationKotlinxJson"))
    implementation(lib("kotlinxSerializationJson"))
    implementation(lib("kotlinSerialization"))
}

