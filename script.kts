import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.system.measureNanoTime

fun Double.root(i: Int = 2): Double {
    var max = this
    var min = 0.0
    while (min != max) {
        val j = min + ((max-min)/2)
        val jw = j.pow(i)
        if (jw > this) {
            max = j
        } else if (jw < this) {
            min = j
        } else if (jw == this) {
            min = j
            max = j
        }
    }
    return max
}

println(90.0.root(2))
