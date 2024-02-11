package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun `getInput returns null for no args`() {
        val args = arrayOf<String>()
        assertNull(getInput(args))
    }

    @Test
    fun `getInput returns null for non-integer args`() {
        val args = arrayOf("text")
        assertNull(getInput(args))
    }

    @Test
    fun `getInput returns null for negative integer`() {
        val args = arrayOf("-5")
        assertNull(getInput(args))
    }

    @Test
    fun `getInput returns integer for valid positive integer arg`() {
        val args = arrayOf("10")
        assertEquals(10, getInput(args))
    }

    @Test
    fun `generateRandomListWithPersons creates list of correct size`() {
        val numberOfPersons = 5
        val list = generateRandomListWithPersons(numberOfPersons)
        assertEquals(numberOfPersons, list.size)
    }
}
