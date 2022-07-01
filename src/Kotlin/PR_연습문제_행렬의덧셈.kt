package Kotlin

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size) { i ->
            Array<Int>(arr1[0].size) { j ->
                arr1[i][j] + arr2[i][j]
            }.toIntArray()
        }
        return answer
    }
}

fun main(){
    val sol = Solution()
    val A = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
    val B = arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
    println(sol.solution(A, B).contentDeepToString())
}