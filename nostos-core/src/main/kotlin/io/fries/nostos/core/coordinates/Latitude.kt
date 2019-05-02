package io.fries.nostos.core.coordinates

internal class Latitude(val degrees: Double) {

    companion object {
        private const val MIN_DEGREES = -90.0
        private const val MAX_DEGREES = 90.0

    }

    init {
        require(degrees in MIN_DEGREES..MAX_DEGREES) { "Latitude '$degrees' should be contained in the range [$MIN_DEGREES, $MAX_DEGREES]" }
    }
}
