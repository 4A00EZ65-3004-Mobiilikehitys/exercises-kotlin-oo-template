package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Paths

class UtilTest {

    @Test
    fun `readAndReplace should replace occurrences of a specified character`() {
        // Given
        val originalString = "Hello, world!"
        val filePath = "temp.txt"
        Files.writeString(Paths.get(filePath), originalString)

        // When
        var modifiedString = ""
        filePath.readAndReplace('o', 'x') {
            modifiedString = it
        }

        // Then
        assertEquals("Hellx, wxrld!", modifiedString)

        // Clean up
        Files.deleteIfExists(Paths.get(filePath))
    }

    @Test
    fun `readAndReplace should throw IllegalArgumentException for invalid file path`() {
        // Given
        val invalidFilePath = "nonexistent.txt"

        // When, Then
        assertThrows(IllegalArgumentException::class.java) {
            invalidFilePath.readAndReplace('o', 'x') {}
        }
    }
}