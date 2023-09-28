rootProject.name = "domain-reservation"

include(
    ":app",
    ":reservation",
)

includeBuild("../../../build-logic")
includeBuild("../model")
includeBuild("../../../utils")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../../../../versions/libs.versions.toml"))
        }
    }
}
