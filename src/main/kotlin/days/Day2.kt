package days

class Day2 : Day(2, "Gift Shop") {

    override fun solvePart1(input: List<String>): String {
        return input
            .first()
            .split(",")
            .sumOf { range ->
                val (start, end) = range.split("-")
                findInvalidProductId(start.toLong(), end.toLong()).sum()
            }.toString()
    }

    /**
     * - starts with 0 -> not an ID
     * - sequence of digits repeated twice -> a valid ID
     */
    private fun findInvalidProductId(start: Long, end: Long): List<Long> {
        return buildList {
            for (i in start ..end) {
                if (i.toChar() == '0') continue
                if (i.toString().length % 2 == 1) continue

                // on split en deux le chiffre
                val firstPart = i.toString().substring(0, i.toString().length/2)
                val lastPart = i.toString().substring(i.toString().length/2, i.toString().length)

                if (firstPart == lastPart) {
                    add(i)
                }
            }
        }
    }


    override fun solvePart2(input: List<String>): String {
        TODO("Not yet implemented")
    }
}