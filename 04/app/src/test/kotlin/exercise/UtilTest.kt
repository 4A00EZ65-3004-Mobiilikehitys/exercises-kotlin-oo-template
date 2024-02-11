package exercise

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class UtilTest {

    @Test
    fun `generateRandomArray produces list of specified amount`() {
        val amount = 5
        val drawables = generateRandomArray(amount)
        assertTrue(drawables.size == amount, "The generated list should contain $amount elements.")
    }

    @Test
    fun `generateRandomArray produces only instances of Drawable`() {
        @Suppress("USELESS_IS_CHECK")

        val drawables = generateRandomArray(10)
        assertTrue(drawables.all { it is Drawable }, "All elements in the generated list should be instances of Drawable.")
    }

    @Test
    fun `generateRandomArray produces Rectangles and RectTriangles`() {
        val drawables = generateRandomArray(10)
        val containsRectangle = drawables.any { it is Rectangle }
        val containsRectTriangle = drawables.any { it is RectTriangle }

        assertTrue(containsRectangle, "The generated list should contain at least one instance of Rectangle.")
        assertTrue(containsRectTriangle, "The generated list should contain at least one instance of RectTriangle.")
    }
}
