package days

class Day1 : Day(1, "Secret Entrance") {
    override fun solvePart1(input: List<String>): String {
        var dialgPos = 50
        val regex = "([LR])(\\d+)".toRegex()

        return input.count { line ->
            val (direction, value) = regex.find(line)?.destructured ?: return@count false
            when (direction) {
                "L" -> dialgPos = (dialgPos - value.toInt()).mod(100)
                "R" -> dialgPos = (dialgPos + value.toInt()).mod(100)
            }

            dialgPos == 0
        }.toString()
    }

    override fun solvePart2(input: List<String>): String {
        var dialPos = 50
        val regex = "([LR])(\\d+)".toRegex()
        var zeroes = 0

        input.forEach { line ->
            val (direction, value) = regex.find(line)?.destructured ?: return@forEach
            val dir = if (direction == "L") -1 else 1

            repeat(value.toInt()) {
                dialPos = (dialPos + dir).mod(100)
                if (dialPos == 0) zeroes++
            }
        }
        return zeroes.toString()
    }
}