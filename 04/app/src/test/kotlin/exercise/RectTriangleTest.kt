package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RectTriangleTest {

    @Test
    fun `draw produces correct triangle for height 1`() {
        val triangle = RectTriangle(1)
        val expected = "X\n"
        assertEquals(expected, triangle.draw(), "The drawn triangle does not match the expected output for height 1.")
    }

    @Test
    fun `draw produces correct triangle for height 3`() {
        val triangle = RectTriangle(3)
        val expected = """
            X
            XX
            XXX
            """.trimIndent() + "\n" // Adding a newline at the end to match the draw method's output
        assertEquals(expected, triangle.draw(), "The drawn triangle does not match the expected output for height 3.")
    }

    @Test
    fun `draw produces correct triangle for height 5`() {
        val triangle = RectTriangle(5)
        val expected = """
            X
            XX
            XXX
            XXXX
            XXXXX
            """.trimIndent() + "\n" // Adding a newline at the end to match the draw method's output
        assertEquals(expected, triangle.draw(), "The drawn triangle does not match the expected output for height 5.")
    }
}
