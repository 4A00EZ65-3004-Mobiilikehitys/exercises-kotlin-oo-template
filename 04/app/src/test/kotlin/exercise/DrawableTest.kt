package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DrawableTest {

    @Test
    fun `draw returns correct string`() {
        val mockDrawable = MockDrawable()
        assertEquals("MockDrawable", mockDrawable.draw(), "The draw method should return 'MockDrawable'.")
    }
}
