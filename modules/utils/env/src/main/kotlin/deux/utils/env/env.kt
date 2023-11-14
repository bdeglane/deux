package deux.utils.env

enum class ENV_VAR(private val text: String) {
    ENV("ENV"),
    API_BFF("API_BFF"),
    API_RESERVATION("API_RESERVATION")
    ;

    fun asText() = text
}

fun getEnv(envVar: String): String {
    try {
        return System.getenv(envVar)
    } catch (e: Exception) {
        throw UnknownEnvVarException("ENV: unknown env var $envVar")
    }
}

fun getEnvVar(variable: ENV_VAR): String {
    return getEnv(variable.asText())

}
