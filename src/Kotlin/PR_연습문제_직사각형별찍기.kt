package Kotlin

fun main(){
    val (a,b) = readLine()!!.split(" ").map(String::toInt)

    var star = ""
    for(i in 1..a)
        star+="*"

    for(i in 1..b)
        println(star)
}