rootProject.name = "domain-reservation"

include(
    ":reservation",
)

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
