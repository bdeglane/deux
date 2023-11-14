rootProject.name = "sdk-reservation"

include("lib")

includeBuild("../../../build-logic")
includeBuild("../../../utils")
includeBuild("../model")

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
