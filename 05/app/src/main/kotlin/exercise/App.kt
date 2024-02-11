package exercise

import org.apache.logging.log4j.LogManager


/**
 * Provides functionality to read each command-line argument, replace occurrences of a specified character,
 * and log the modified strings using Log4j.
 *
 * This main function reads each command-line argument, replaces occurrences of the specified character ('o') with
 * another character ('x'), and logs the modified strings using Log4j.
 *
 * @param args An array of strings representing command-line arguments.
 */
fun main(args: Array<String>) {
    // Initialize logger
    val logger = LogManager.getLogger()
    // Process each command-line argument
    args.forEach { it ->
        // Replace occurrences of 'o' with 'x' and log the modified string
        it.readAndReplace('o', 'x') {
            logger.info(it)
        }
    }
}
