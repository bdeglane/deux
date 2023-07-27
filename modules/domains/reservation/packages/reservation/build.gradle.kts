plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.serialization") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("deux.utils:uuid")
    implementation("deux.reservation.model:lib")
    implementation(libs.ktorServerCoreJvm)
    implementation(libs.ktorServerResources)
    implementation(libs.ktorSerializationKotlinxJson)
    implementation(libs.kotlinxDatetime)
    implementation(libs.koinKtor)
    // implementation(libs.jacksonModuleKotlin)

    testImplementation("deux.reservation.model:lib")

    testImplementation(libs.kotlinTestJunit5)
    testImplementation(libs.junitJupiterEngine)
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
