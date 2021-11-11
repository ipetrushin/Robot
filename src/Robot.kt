class Robot(var x: Int, var y: Int, var direction: Direction) {
    fun stepForward() {
        when (direction) {
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
            Direction.UP -> y++
            Direction.DOWN -> y--
            }
    }
    // TODO: добавить функции turnLeft, turnRight

    override fun toString(): String {
        return "(${x}, ${y}), looks ${direction}"
    }
}
