// val ktor_version: String by project
// val kotlin_version: String by project
// val logback_version: String by project

plugins {
    kotlin("jvm") version "1.9.0"
    id("io.ktor.plugin") version "2.3.2"
}

group = "app.reservation.deux"
version = "0.0.1"

application {
    mainClass.set("deux.reservation.app.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":reservation"))

    implementation(libs.ktorServerCoreJvm)
    implementation(libs.ktorServerOpenApi)
    implementation(libs.ktorServerNettyJvm)
    implementation(libs.logbackCassic)

    // implementation(libs.springContext)
    implementation(libs.koinKtor)
    implementation(libs.koinLoggerSlf4j)

    testImplementation(libs.kotlinTestJunit)
    testImplementation(libs.ktorServerTestsJvm)
}
