rootProject.name = "build-logic"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../../versions/libs.versions.toml"))
        }
    }
}
