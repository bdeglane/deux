plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":domains:reservation:model"))
    api(project(":utils:uuid"))
}
