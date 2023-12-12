rootProject.name = "utils"

include(
    ":uuid",
    ":date",
    ":client",
    ":env",
    ":server",
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
