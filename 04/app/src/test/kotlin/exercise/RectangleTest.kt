package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RectangleTest {

    @Test
    fun `draw produces correct rectangle for width 1 and height 1`() {
        val rectangle = Rectangle(1, 1)
        val expected = "X\n"
        assertEquals(expected, rectangle.draw(), "The drawn rectangle does not match the expected output for width 1 and height 1.")
    }

    @Test
    fun `draw produces correct rectangle for width 3 and height 2`() {
        val rectangle = Rectangle(3, 2)
        val expected = """
            XXX
            XXX
            """.trimIndent() + "\n" // Adding a newline at the end to match the draw method's output
        assertEquals(expected, rectangle.draw(), "The drawn rectangle does not match the expected output for width 3 and height 2.")
    }

    @Test
    fun `draw produces correct rectangle for width 4 and height 3`() {
        val rectangle = Rectangle(4, 3)
        val expected = """
            XXXX
            XXXX
            XXXX
            """.trimIndent() + "\n" // Adding a newline at the end to match the draw method's output
        assertEquals(expected, rectangle.draw(), "The drawn rectangle does not match the expected output for width 4 and height 3.")
    }
}
