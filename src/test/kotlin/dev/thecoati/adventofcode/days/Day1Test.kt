package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class Day1Test {
    private val day1 = Day1()

    @Test
    fun part1() {
        val input = FileInput("day1_1")

        val expected = "142"
        val result = this.day1.part1(input)

        assertEquals(expected, result)
    }

    @Test
    fun part2() {
        val input = FileInput("day1_2")

        val expected = "281"
        val result = this.day1.part2(input)

        assertEquals(expected, result)
    }
}