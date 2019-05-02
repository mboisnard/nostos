package io.fries.nostos.core.coordinates

internal class Longitude(val degrees: Double) {

    companion object {
        private const val MIN_DEGREES = -180.0
        private const val MAX_DEGREES = 180.0
    }

    init {
        require(degrees in MIN_DEGREES..MAX_DEGREES) { "Longitude '$degrees' should be contained in the range [$MIN_DEGREES, $MAX_DEGREES]" }
    }
}