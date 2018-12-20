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

    val arg = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8,9)
    convert(arg)
    arg.forEach(::println)

    fun isPrime(N:Int): Boolean {
        if (N<2){
            return false
        }
        for (i in 2 until N){
            if (N%i==0) {
                println("N%i $N  $i")
                return false
            }
        }
        return true
    }
    println("isPrime() ${isPrime(7)}")
}
