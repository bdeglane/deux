plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":modules:domains:reservation:model"))
    implementation(project(":modules:utils:uuid"))
}
