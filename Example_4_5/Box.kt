package Example_4_5

class Box(width: Int, height: Int, depth: Int) {
    private val width = width
    private val height = height
    private val depth = depth

    fun calculateVolume(): Int {
        return width * height * depth
    }
}