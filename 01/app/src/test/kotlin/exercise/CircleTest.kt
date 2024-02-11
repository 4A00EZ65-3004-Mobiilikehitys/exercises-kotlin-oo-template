package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CircleTest {

    @Test
    fun `test circle surface area`() {
        val circle = Circle(1) // Radius = 1
        assertEquals(Math.PI, circle.getSurfaceArea(), "Surface area calculation is incorrect")
    }

    @Test
    fun `test circle toString with color`() {
        val circle = Circle(1, "red") // Radius = 1, Color = red
        assertEquals("radius = 1, color = red", circle.toString(), "toString output is incorrect with color")
    }

    @Test
    fun `test circle toString without color`() {
        val circle = Circle(1) // Radius = 1
        assertEquals("radius = 1", circle.toString(), "toString output is incorrect without color")
    }
}
