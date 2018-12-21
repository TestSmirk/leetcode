class test {

}

fun main(args: Array<String>) {
    fun gcd(p: Int, q: Int): Int {
        if (q == 0) return p
        val r = if (p > q) p - q else q - p
        return gcd(q, r)
    }
    println(gcd(98, 63))

    fun convert(arg: IntArray) {

        val N = arg.size
        for (i in 0 until N / 2) {
            val temp = arg[i]
            println("before arg[i] ${arg[i]}  arg[N - 1 - i] ${arg[N - 1 - i]}")
            arg[i] = arg[N - 1 - i]
            println("after arg[i] ${arg[i]}  arg[N - 1 - i] ${arg[N - 1 - i]}")
            arg[N - i - 1] = temp
        }
    }

    val arg = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    convert(arg)
    arg.forEach(::println)

    fun isPrime(N: Int): Boolean {
        if (N < 2) {
            return false
        }
        for (i in 2 until N) {
            if (N % i == 0) {
                println("N%i $N  $i")
                return false
            }
        }
        return true
    }

    println("isPrime() ${isPrime(7)}  ${Double.NaN} ${1e-15} ${Double.MAX_VALUE}")

    fun sqrt(c: Double): Double {
        if (c < 0) return Double.NaN
        val err = 1e-15
        var t = c
        while (Math.abs(t - c / t) > err * t) {
            println("(c/t+t) c $c t $t c/t ${c / t}")
            t = (c / t + t) / 2.0
        }
        return t
    }
    println("sqrt(100.0) ${sqrt(100.0)}")

    val i = -2147483648
    println("boolean ${i < 0}  ${-(-2147483648)} ${Int.MAX_VALUE}")
    println(" ${1.0/0.0}")
    println("Math ${Math.abs(i)}")


}
