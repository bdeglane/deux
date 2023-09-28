plugins {
    id("deux.kotlin-server-conventions")
}

group = "app.reservation.deux"

application {
    mainClass.set("deux.reservation.app.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

dependencies {
    implementation(project(":reservation"))
}
