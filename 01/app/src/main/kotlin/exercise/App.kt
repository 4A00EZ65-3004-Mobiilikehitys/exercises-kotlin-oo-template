package exercise

import org.apache.logging.log4j.LogManager


fun main() {
    val logger = LogManager.getLogger()

    var jack = Person("jack smith")
    logger.info(jack.name)

    val c1 = Circle(radius = 5, color = "red")
    val c2 = Circle(radius = 5)

    logger.info("c1: radius = ${c1.radius}")
    logger.info("c1: surface area = ${c1.getSurfaceArea()}")
    logger.info("c1: $c1")
    logger.info("c2: radius = ${c2.radius}")
    logger.info("c2: $c2")
}