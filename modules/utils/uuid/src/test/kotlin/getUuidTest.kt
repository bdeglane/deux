import uuid.getUUID
import kotlin.test.Test
import kotlin.test.assertIs

class Toto {

    @Test
    fun `GIVEN WHEN THEN `() {
        val uuid = getUUID()

        assertIs<String>(uuid)
    }
}
