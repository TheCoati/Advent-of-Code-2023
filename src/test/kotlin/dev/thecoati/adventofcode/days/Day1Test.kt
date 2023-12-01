package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class Day1Test {
    private val day1 = Day1()
    private val input = FileInput("day1")

    @Test
    fun part1() {
        val expected = "77"
        val result = this.day1.part1(this.input)

        assertEquals(expected, result)
    }

    @Test
    fun part2() {
        val expected = "0"
        val result = this.day1.part2(this.input)

        assertEquals(expected, result)
    }
}