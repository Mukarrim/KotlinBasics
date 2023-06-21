package challenges

data class Robot(var x: Int, var y: Int, var orientation: Char)

class Grid( val maxX: Int,  val maxY: Int) {
    private val lostRobots = mutableSetOf<Pair<Int, Int>>()

    fun isRobotLost(robot: Robot): Boolean = lostRobots.contains(robot.x to robot.y)

    fun markRobotAsLost(robot: Robot) {
        lostRobots.add(robot.x to robot.y)
    }
}

fun moveForward(robot: Robot) {
    when (robot.orientation) {
        'N' -> robot.y++
        'S' -> robot.y--
        'E' -> robot.x++
        'W' -> robot.x--
    }
}

fun turnLeft(robot: Robot) {
    val orientations = listOf('N', 'W', 'S', 'E')
    val currentIndex = orientations.indexOf(robot.orientation)
    robot.orientation = orientations[(currentIndex + 1) % 4]
}

fun turnRight(robot: Robot) {
    val orientations = listOf('N', 'E', 'S', 'W')
    val currentIndex = orientations.indexOf(robot.orientation)
    robot.orientation = orientations[(currentIndex + 1) % 4]
}

fun processRobotInstructions(grid: Grid, robot: Robot, instructions: String): Boolean {
    for (instruction in instructions) {
        when (instruction) {
            'F' -> {
                val newRobot = Robot(robot.x, robot.y, robot.orientation)
                moveForward(newRobot)

                if (newRobot.x !in 0..grid.maxX || newRobot.y !in 0..grid.maxY) {
                    if (!grid.isRobotLost(robot)) {
                        grid.markRobotAsLost(robot)
                        return true // Robot is lost
                    }
                } else {
                    robot.x = newRobot.x
                    robot.y = newRobot.y
                }
            }
            'L' -> turnLeft(robot)
            'R' -> turnRight(robot)
        }
    }

    return false // Robot is not lost
}

fun solveMartianRobots(inputData: String) {
    val lines = inputData.trim().split('\n')
    val gridSize = lines[0].split(' ').map(String::toInt)
    val grid = Grid(gridSize[0], gridSize[1])

    var i = 1
    while (i < lines.size) {
        val (x, y, orientation) = lines[i].split(' ')
        val instructions = lines[i + 1]

        val robot = Robot(x.toInt(), y.toInt(), orientation[0])
        val isLost = processRobotInstructions(grid, robot, instructions)

        var position = "${robot.x}${robot.y}${robot.orientation}"
        if (isLost) {
            position += " LOST"
        }

        println(position)

        i += 2
    }
}

// Example usage
val inputData = """
5 3
1 1 E
RFRFRFRF
3 2 N
FRRFLLFFRRFLL
0 3 W
LLFFFLFLFL
"""

fun main() {
    solveMartianRobots(inputData)
}
