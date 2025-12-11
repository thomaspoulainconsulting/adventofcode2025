package days

class Day3 : Day(3, "Lobby") {

    override fun solvePart1(input: List<String>): String {
        return input.sumOf { bank ->
            val batterie = bank.map { it }

            val firstBiggestNumber = batterie.indexOfFirst { it == batterie.maxOf { it } }
            val secondBiggestNumber = if (firstBiggestNumber == batterie.lastIndex) {
                batterie.take(batterie.lastIndex)
                    .indexOfFirst { it == batterie.take(batterie.lastIndex).maxOf { it } }
            } else {
                firstBiggestNumber+batterie.drop(firstBiggestNumber+1).indexOfFirst {
                    it == batterie.drop(firstBiggestNumber+1).maxOf { it }
                }+1
            }

            if (firstBiggestNumber < secondBiggestNumber) {
                "${batterie[firstBiggestNumber]}${batterie[secondBiggestNumber]}".toInt()
            } else {
                "${batterie[secondBiggestNumber]}${batterie[firstBiggestNumber]}".toInt()
            }
        }.toString()
    }

    override fun solvePart2(input: List<String>): String {
        TODO("Not yet implemented")
    }
}