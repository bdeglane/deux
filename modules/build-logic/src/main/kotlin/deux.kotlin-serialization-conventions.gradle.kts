plugins {
    id("deux.library-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(lib("kotlinSerialization"))
    implementation(lib("ktorSerializationKotlinxJson"))
}
