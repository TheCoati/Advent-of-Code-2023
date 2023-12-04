package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class Day2Test {
    private val day = Day2()

    @Test
    fun part1() {
        val input = FileInput("day2")

        val expected = "8"
        val result = this.day.part1(input)

        assertEquals(expected, result)
    }

    @Test
    fun part2() {
        val input = FileInput("day2")

        val expected = "2286"
        val result = this.day.part2(input)

        assertEquals(expected, result)
    }
}