rootProject.name = "domain-reservation"

include(
    ":app",
    ":model",
    ":domain",
)

includeBuild("../../../utils")
