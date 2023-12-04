package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput

class Day2: Day {
    override fun day(): Int {
        return 2
    }

    override fun title(): String {
        return "Cube Conundrum"
    }

    override fun input(): FileInput {
        return FileInput("day2")
    }

    override fun part1(input: FileInput): String {
        val values = mutableListOf<Int>()

        input.forEach {
            val split = it.split(":")
            val parse = this.parse(split)

            values.addAll(parse.second)
        }

        return values.sum().toString()
    }

    override fun part2(input: FileInput): String {
        val values = mutableListOf<Int>()

        input.forEach {
            val split = it.split(":")
            val parse = this.parse(split)

            values.add(parse.second[0] * parse.second[1] * parse.second[2])
        }

        return values.sum().toString()
    }

    private fun parse(data: List<String>): Pair<Int, List<Int>> {
        val game = data[0].trim().replace("Game ", "").toInt()

        var red = 0
        var green = 0
        var blue = 0

        data[1].split(";").map { bag -> bag.trim() }.forEach { bag ->
            bag.split(",").map { cube -> cube.trim() }.forEach { cube ->
                val parts = cube.split(" ")
                val color = parts[1]
                val value = parts[0].toInt()

                when (color) {
                    "red" -> if (value > red) red = parts[0].toInt()
                    "green" -> if (value > green) green = parts[0].toInt()
                    "blue" -> if (value > blue) blue = parts[0].toInt()
                }
            }
        }

        return Pair(game, listOf(red, green, blue))
    }
}