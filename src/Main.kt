class Main {

}
data class Person(val name: String, val age: Int)

enum class Direction {
    UP, DOWN, LEFT, RIGHT
}
fun moveRobot(r: Robot, toX: Int, toY: Int) {
    // TODO: реализовать движение робота
    // в точку (toX, toY)
}

fun main() {
    val p = Person("Vasya", 14)
    println(p) /*
    val r1 = Robot(3, 4, Direction.RIGHT)
    val r2 = Robot(0, 0, Direction.DOWN)
    println("${r1.x}, ${r1.y}, ${r1.direction}")
    r1.stepForward()
    println("${r2.x}, ${r2.y}, ${r2.direction}")
    println("${r1.x}, ${r1.y}, ${r1.direction}")
    println(r1)
    println(r2)
    */

}