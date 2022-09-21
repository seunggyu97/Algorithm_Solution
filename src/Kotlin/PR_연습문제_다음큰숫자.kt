package Kotlin

class NextBigNum{
    fun nextBigNum(num: Int): Int{
        val count: Int = checkNum(num)
        var answer: Int = num+1
        while(true){
            if(checkNum(answer) == count) break
            answer++
        }

        return answer
    }

    fun checkNum(num : Int): Int{
        var count:Int = 0
        val binary:String =Integer.toBinaryString(num)

        for(i in binary){
            if(i == '1') count++
        }

        return count
    }
}
fun main(){
    val num = 78
    val sol = NextBigNum()

    println(sol.nextBigNum(78))
}