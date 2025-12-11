package days

import AdventOfCodeTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day3Test : AdventOfCodeTest {

    private val day = Day3()
    private val input =
        """
            987654321111111
            811111111111119
            234234234234278
            818181911112111
        """.trimIndent().split('\n')


    @Test
    override fun solvePart1Test() {
        assertEquals("357", day.solvePart1(input))
        assertEquals("53", day.solvePart1(listOf("2212122322222322252322212232223221132122212123212332221211222232222221123232122212332222222213222223")))

    }

    @Test
    override fun solvePart2Test() {
        assertEquals("", day.solvePart2(input))
    }
}