fun mySqrt(x: Int): Int {
    var lo = 1
    var hi = x
    var answer = 0

    while (lo <= hi) {
        val mid = lo + (hi - lo) / 2
        if (mid <= x / mid) { // mid * mid <= x, without overflow
            answer = mid      // mid works, try something bigger
            lo = mid + 1
        } else {
            hi = mid - 1
        }
    }
    return answer
}

fun main() {
    println(mySqrt(4))            // 2
    println(mySqrt(8))            // 2
    println(mySqrt(0))            // 0
    println(mySqrt(2147483647))   // 46340
}
