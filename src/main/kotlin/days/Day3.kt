package days

class Day3 : Day(3, "Lobby") {

    override fun solvePart1(input: List<String>): String {
        return input.sumOf { bank ->
            val firstIndex = bank.indexOfFirst { it == bank.maxOf { it } }
            val secondIndex = if (firstIndex == bank.lastIndex) {
                bank.take(bank.lastIndex).indexOfFirst { it == bank.take(bank.lastIndex).maxOf { it } }
            } else {
                firstIndex + bank.drop(firstIndex + 1).indexOfFirst { it == bank.drop(firstIndex + 1).maxOf { it } } + 1
            }

            val result = "${bank[firstIndex]}${bank[secondIndex]}"
            if (firstIndex < secondIndex) result.toInt()
            else result.reversed().toInt()

        }.toString()
    }

    override fun solvePart2(input: List<String>): String {
        TODO("Not yet implemented")
    }
}