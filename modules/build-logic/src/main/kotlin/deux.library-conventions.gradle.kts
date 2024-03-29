plugins {
    id("deux.java-conventions")
    id("deux.kotlin-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(lib("kotlinTestJunit5"))
    testImplementation(lib("junitJupiterEngine"))
    testImplementation(lib("mockk"))
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
