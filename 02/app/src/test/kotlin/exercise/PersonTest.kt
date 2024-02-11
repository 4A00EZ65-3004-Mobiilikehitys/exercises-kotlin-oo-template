package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun drink_returnsCorrectMessage() {
        val person = Person("Alice")
        assertEquals("Alice drinks water.", person.drink())
    }

    @Test
    fun sleep_returnsCorrectMessage() {
        val person = Person("Alice")
        assertEquals("Alice sleeps", person.sleep())
    }

    @Test
    fun toString_returnsCorrectFormat() {
        val person = Person("Alice")
        assertEquals("Name: Alice", person.toString())
    }
}
