package Kotlin

class Solution {
    fun solution(lottos : IntArray, win_nums : IntArray):IntArray{
        var zero = lottos.filter { it == 0 }.size;
        var low = 7
        var high = 7

        lottos.forEach { num ->
            if(win_nums.any{lottoNum -> lottoNum == num}){
                low--
                high--
            }
        }
        high -= zero

        if(high > 6) high = 6
        if(low > 6) low = 6
        return intArrayOf(high,low)
    }
}
fun main(){
    val lottos = intArrayOf(44, 1, 0, 0, 31, 25)
    val win_nums = intArrayOf(31, 10, 45, 1, 6, 19)

    val solution = Solution()
    println(solution.solution(lottos, win_nums).contentToString())
}