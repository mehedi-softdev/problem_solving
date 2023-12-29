package org.mehedisoftdev


/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    val fallenApples: MutableList<Int> = mutableListOf()
    val fallenOranges: MutableList<Int> = mutableListOf()

    apples.forEach {
        val countApple = a + it
        fallenApples.add(countApple)
    }

    oranges.forEach {
        val countOrange = b + it
        fallenOranges.add(countOrange)
    }

    countApplesAndOrangesForSamsHouse(fallenApples, fallenOranges, s, t)
}

fun countApplesAndOrangesForSamsHouse(fallenApples: List<Int>, fallenOranges: List<Int>, s: Int, t: Int) {
    var totalApple = 0
    var totalOrange = 0

    fallenApples.forEach {
        if(it >= s && it <= t) {
            totalApple++
        }
    }

    fallenOranges.forEach {
        if(it >= s && it <= t) {
            totalOrange++
        }
    }
    println(totalApple)
    println(totalOrange)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}