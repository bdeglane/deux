plugins {
    id("deux.library-conventions")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(lib("ktorServerCoreJvm"))
    implementation(lib("ktorServerOpenApi"))
    implementation(lib("ktorServerRequestValidation"))
    implementation(lib("ktorServerContentNegociation"))
    implementation(lib("ktorServerNettyJvm"))
    implementation(lib("ktorServerResources"))
    implementation(lib("ktorSerializationKotlinxJson"))
    implementation(lib("logbackCassic"))

    implementation(lib("koinKtor"))
    implementation(lib("koinLoggerSlf4j"))
    implementation(lib("kotlinxDatetime"))

    testImplementation(lib("ktorServerTestsJvm"))
}
