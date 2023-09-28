rootProject.name = "model-reservation"

include("lib")

includeBuild("../../../build-logic")
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
