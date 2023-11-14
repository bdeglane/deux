package deux.utils.env

import io.mockk.every
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class EnvKtTest {

    // @Test
    // fun `GIVEN at runtime WHEN getting an env var that exist THEN the value of the env var is returned`() {
    //     assert(getEnvVar(ENV_VAR.ENV) == "OK")
    // }

    @Test
    fun `GIVEN at runtime WHEN getting an env var that doesn't exist THEN an exception is thrown`() {
        assertThrows<UnknownEnvVarException> { getEnvVar(ENV_VAR.API_BFF) }
    }
}
