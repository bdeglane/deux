plugins {
    idea
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
