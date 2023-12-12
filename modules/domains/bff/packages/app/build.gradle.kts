plugins {
    id("deux.library-conventions")
    id("deux.kotlin-serialization-conventions")
    id("deux.kotlin-server-conventions")
}

group = "bff.deux"
version = "0.0.1"

application {
    mainClass.set("deux.bff.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}
