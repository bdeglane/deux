rootProject.name = "utils"

include(
    ":uuid",
    ":date",
    ":client",
)

includeBuild("../build-logic")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../../versions/libs.versions.toml"))
        }
    }
}
