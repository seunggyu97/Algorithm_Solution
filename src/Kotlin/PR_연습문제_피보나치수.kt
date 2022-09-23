package Kotlin

class Fibo{
    fun fibo(n: Int): Int{
        var ans = Array(n+1) { i -> 0}
        ans[1] = 1
        for(idx in 2..n)
            ans[idx] = (ans[idx - 2] + ans[idx - 1]) % 1234567

        return ans[n]
    }
}
fun main(){
    val n = 5
    val sol = Fibo()

    println(sol.fibo(n))
}