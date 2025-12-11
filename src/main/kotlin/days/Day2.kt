package days

class Day2 : Day(2, "Gift Shop") {

    override fun solvePart1(input: List<String>): String {
        return input
            .first()
            .split(",")
            .sumOf { range ->
                val (start, end) = range.split("-")
                findInvalidProductIdPart1(start.toLong(), end.toLong()).sum()
            }.toString()
    }

    /**
     * - starts with 0 -> not an ID
     * - sequence of digits repeated twice -> a valid ID
     */
    private fun findInvalidProductIdPart1(start: Long, end: Long): List<Long> {
        return buildList {
            for (i in start..end) {
                val number = i.toString()
                if (number.startsWith('0')) continue
                if (number.length % 2 == 1) continue

                number.chunked(number.length / 2)
                    .takeIf { it.first() == it.last() }
                    ?.let { add(i) }
            }
        }
    }

    override fun solvePart2(input: List<String>): String {
        return input
            .first()
            .split(",")
            .sumOf { range ->
                val (start, end) = range.split("-")
                findInvalidProductIdPart2(start.toLong(), end.toLong()).sum()
            }.toString()
    }

    /**
     * - starts with 0 -> not an ID
     * - sequence of digits repeated at least twice -> a valid ID
     */
    private fun findInvalidProductIdPart2(start: Long, end: Long): List<Long> {
        return buildList {
            for (i in start..end) {
                val number = i.toString()
                if (number.startsWith('0')) continue

                (number.length / 2 downTo 1).forEach { chunkSize ->
                    number.chunked(chunkSize)
                        .takeIf { chunked -> chunked.all { it == chunked.first() } }
                        ?.let {
                            if (!this.contains(i)) {
                                add(i)
                            }
                        }
                }
            }
        }
    }
}