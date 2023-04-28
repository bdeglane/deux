rootProject.name = "domain-reservation"

include(
    ":app",
    ":model",
    ":services",
    ":reservation",
)

includeBuild("../../../utils")

