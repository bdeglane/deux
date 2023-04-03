plugins {
    id("org.springframework.boot") version "3.0.2"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
}

repositories {
    mavenCentral()
}

group = "deux.domain.reservation"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":model"))
    implementation("deux.utils:uuid")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.bootJar { enabled = false }
tasks.jar { enabled = true }
