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
    mainClass.set("app.reservation.deux.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.ktorServerCoreJvm)
    implementation(libs.ktorServerOpenApi)
    implementation(libs.ktorServerNettyJvm)
    implementation(libs.logbackCassic)

    testImplementation(libs.kotlinTestJunit)
    testImplementation(libs.ktorServerTestsJvm)
}
