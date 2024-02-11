package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun `equals verifies two persons are equal`() {
        val person1 = Person("Alice", 30)
        val person2 = Person("Alice", 30)
        assertEquals(person1, person2)
    }

    @Test
    fun `equals verifies two persons are not equal due to different ages`() {
        val person1 = Person("Alice", 30)
        val person2 = Person("Alice", 31)
        assertNotEquals(person1, person2)
    }

    @Test
    fun `copy creates an identical person`() {
        val original = Person("Bob", 25)
        val copy = original.copy()
        assertEquals(original, copy)
    }

    @Test
    fun `copy with modifications reflects changes`() {
        val original = Person("Charlie", 40)
        val modifiedCopy = original.copy(age = 41)
        assertNotEquals(original.age, modifiedCopy.age)
        assertEquals(41, modifiedCopy.age)
    }

    @Test
    fun `toString returns expected string format`() {
        val person = Person("Dave", 20)
        assertEquals("Person(name=Dave, age=20)", person.toString())
    }
}
