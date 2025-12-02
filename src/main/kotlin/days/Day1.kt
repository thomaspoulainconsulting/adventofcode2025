package days

class Day1 : Day(1, "Secret Entrance") {
    override fun solvePart1(input: List<String>): String {
        var dialPointing = 50
        var count = 0
        val regex = "([LR])(\\d+)".toRegex()

        input.forEach { line ->
            val (direction, value) = regex.find(line)?.destructured ?: return@forEach
            when (direction) {
                "L" -> dialPointing = (dialPointing - value.toInt()).mod(100)
                "R" -> dialPointing = (dialPointing + value.toInt()).mod(100)
            }

            if (dialPointing == 0) count++
        }

        return count.toString()
    }

    override fun solvePart2(input: List<String>): String {
        TODO("Not yet implemented")
    }
}