package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ProgrammerTest {

    @Test
    fun drink_returnsCorrectMessage() {
        val programmer = Programmer("Bob", 50000.0)
        assertEquals("Bob drinks energy drink", programmer.drink())
    }

    @Test
    fun codeApps_returnsCorrectMessage() {
        val programmer = Programmer("Bob", 50000.0)
        assertEquals("Bob codes app with salary of 50000.0", programmer.codeApps())
    }

    @Test
    fun toString_returnsCorrectFormat() {
        val programmer = Programmer("Bob", 50000.0)
        assertEquals("Name: Bob, Salary: 50000.0", programmer.toString())
    }

    @Test
    fun settingNegativeSalary_throwsIllegalArgumentException() {
        val programmer = Programmer("Bob", 50000.0)
        val exception = assertThrows(IllegalArgumentException::class.java) {
            programmer.salary = -1000.0
        }
        assertEquals("salary must be > 0.", exception.message)
    }
}
