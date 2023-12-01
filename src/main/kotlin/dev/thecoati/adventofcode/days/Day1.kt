package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput

class Day1: Day {
    override fun day(): Int {
        return 1
    }

    override fun title(): String {
        return "Trebuchet?!"
    }

    override fun input(): FileInput {
        return FileInput("day1")
    }

    override fun part1(input: FileInput): String {
        return input.map {
            val numbers = it.filter { s -> s.isDigit() }
                .map { s -> Integer.parseInt(s.toString()) }

            val first = numbers.first()
            val last = numbers.last()
            val num = "$first$last"

            return@map num.toInt()
        }.sum().toString()
    }

    override fun part2(input: FileInput): String {
        val mapping = mapOf(
            Pair("1", 1),
            Pair("2", 2),
            Pair("3", 3),
            Pair("4", 4),
            Pair("5", 5),
            Pair("6", 6),
            Pair("7", 7),
            Pair("8", 8),
            Pair("9", 9),
            Pair("one", 1),
            Pair("two", 2),
            Pair("three", 3),
            Pair("four", 4),
            Pair("five", 5),
            Pair("six", 6),
            Pair("seven", 7),
            Pair("eight", 8),
            Pair("nine", 9),
        )

        return input.map {
            val first = mapping.minBy { check -> it.indexOf(check.key).let { if (it == -1) Int.MAX_VALUE else it } }.value
            val last = mapping.maxBy { check -> it.lastIndexOf(check.key) }.value
            val num = "$first$last"

            return@map num.toInt()
        }.sum().toString()
    }
}