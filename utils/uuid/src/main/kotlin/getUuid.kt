package uuid

import java.util.UUID

fun getUUID(): String {
    return UUID.randomUUID().toString()
}
