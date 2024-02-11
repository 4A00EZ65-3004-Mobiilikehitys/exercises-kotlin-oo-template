package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PersonTests {

    @Test
    fun `test person name initialization`() {
        val person = Person("John Doe")
        assertEquals("John Doe", person.name, "Person name was not initialized correctly")
    }

    @Test
    fun `test person name update`() {
        val person = Person("Initial Name")
        person.name = "Updated Name"
        assertEquals("Updated Name", person.name, "Person name was not updated correctly")
    }
}
