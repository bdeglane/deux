rootProject.name = "sdk-reservation"

include("lib")

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
