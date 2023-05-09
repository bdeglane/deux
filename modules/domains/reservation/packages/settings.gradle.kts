rootProject.name = "domain-reservation"

include(
    ":app",
    ":model",
    ":reservation",
)

includeBuild("../../../utils")

