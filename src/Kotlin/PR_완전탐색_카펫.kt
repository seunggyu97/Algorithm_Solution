package Kotlin

class Carpet{
    fun carpet(brown: Int, yellow: Int): IntArray{
        val answer = IntArray(2, { 0 })
        val sum = brown + yellow

        for(i in 3..sum){
            val row = i
            val col = sum / i

            if(row > col) continue

            if((row - 2) * (col - 2) == yellow){
                answer[0] = col
                answer[1] = row
                break
            }
        }
        return answer
    }

}
fun main(){
    val brown = 10
    val yellow = 2
    val sol = Carpet()

    println(sol.carpet(brown, yellow).contentToString())
}