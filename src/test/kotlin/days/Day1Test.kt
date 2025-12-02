package days

import AdventOfCodeTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test : AdventOfCodeTest {

    private val day = Day1()
    private val input =
        """
            L68
            L30
            R48
            L5
            R60
            L55
            L1
            L99
            R14
            L82
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("3", day.solvePart1(input))
    }

    @Test
    override fun solvePart2Test() {
        assertEquals("10", day.solvePart2(listOf("R1000")))
        assertEquals("9", day.solvePart2(listOf("R999")))
        assertEquals("6", day.solvePart2(input))
    }

}