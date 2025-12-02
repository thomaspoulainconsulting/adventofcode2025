package days

import AdventOfCodeTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test : AdventOfCodeTest {

    private val day = Day1()
    private val input =
        """
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("11", day.solvePart1(input))
    }

    @Test
    override fun solvePart2Test() {
        assertEquals("31", day.solvePart2(input))
    }

}