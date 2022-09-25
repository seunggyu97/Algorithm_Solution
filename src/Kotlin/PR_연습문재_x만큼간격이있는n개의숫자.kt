package Kotlin.numbersStepX

import java.util.*

class Solution{
    fun solution(x:Int, n:Int): LongArray = LongArray(n){x.toLong() * (it+1)}
}
fun main(){
    val sol = Solution()
    println(sol.solution(3, 5).contentToString())
}