rootProject.name = "domain-reservation"

include(
    ":app",
    ":model",
    ":services",
)

includeBuild("../../utils")
