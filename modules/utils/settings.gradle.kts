rootProject.name = "utils"

include(
    ":uuid",
    ":date",
)

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
