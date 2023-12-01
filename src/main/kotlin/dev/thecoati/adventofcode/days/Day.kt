package dev.thecoati.adventofcode.days

import dev.thecoati.adventofcode.FileInput

interface Day {
    /**
     * Returns the index of the day in the calendar.
     * @return Exercise day of the calendar
     */
    fun day(): Int

    /**
     * Get the subject title of the exercise.
     * @return String of the exercise title
     */
    fun title(): String

    /**
     * Returns the input of the exercise.
     * @return Input data with generic type
     */
    fun input(): FileInput

    /**
     * Returns the part 1 answer of the exercise.
     * @param input exercise input of generic type
     * @return String with the part 1 exercise answer
     */

    fun part1(input: FileInput): String

    /**
     * Returns the part2 answer of the exercise.
     * @param input exercise input of generic type
     * @return String with the part 2 exercise answer
     */
    fun part2(input: FileInput): String
}