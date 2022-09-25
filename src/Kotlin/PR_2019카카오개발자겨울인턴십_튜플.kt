package Kotlin.tuple

import kotlin.collections.HashMap

class Solution{
    fun solution(s: String): IntArray {
        val hm = HashMap<Int, Int>()
        var sb = StringBuilder()
        var flag: Boolean = false
        for(i in 0 until s.length){
            val ch: Char = s[i]

            if(ch in '0'..'9'){
                sb.append(ch)
                flag = true
            }else{
                if(flag) {
                    val value: Int = sb.toString().toInt()
                    if(hm.containsKey(value)) hm[value] = hm[value]!! + 1
                    else hm[value] = 1
//                    hm.put(value, hm.getOrDefault(value, 0) + 1)
                    sb = StringBuilder()
                    flag = false
                }
            }
        }

        val sortedMap = hm.toSortedMap(Comparator{
            o1, o2 -> hm[o2]!!.compareTo(hm[o1]!!)
        }).keys.toIntArray()

        return sortedMap
    }
}

fun main(){
    val s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"
    val sol = Solution()

    println(sol.solution(s).contentToString())
}