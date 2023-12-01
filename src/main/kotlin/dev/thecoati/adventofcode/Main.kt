package dev.thecoati.adventofcode

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val story = Story()
        story.load("dev.thecoati.adventofcode.days")
        story.output()
    }
}