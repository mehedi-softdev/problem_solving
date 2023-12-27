package org.mehedisoftdev;

/*
*
*  rules of finding the next multiple of 5 of a given number is :
*   (number / 5) then take the integer part only and multiply it by 5 and finally add 5 with the result
*   Step 1: 33/5 = 6.6
*   Step 2: 6 * 5 = 30
*   Step 3: 30 + 5 = 35
*   Answer: next multiple of 5 of the number 33 is 35
*
* */


fun main()  {
    val numberOfStudents = readLine()!!.trim().toInt()
    val grades : MutableList<Int> = mutableListOf()

    for(i in 0 until  numberOfStudents) {
        val grade = readLine()!!.trim().toInt()
        grades.add(grade)
    }
    var i = 0;
    // now check each grade and modify
    grades.forEach {
        // rounding only apply when student passed
        if(it > 35) {
            val nextMultipleOfFiveNumber = getNextMultipleOfFive(it)
            val changedNumber: Int = applyRounding(it, nextMultipleOfFiveNumber)
            // and put the changed number again to the list
            grades[i] = changedNumber
        }
        i++;
    }

    // print the number after modify
    grades.forEach {
        println(it)
    }


}

fun applyRounding(number: Int, nextNumber: Int): Int {
    var changedNumber = number
    if((nextNumber - number) < 3) {
        changedNumber = nextNumber
    }
    return changedNumber
}

fun getNextMultipleOfFive(number: Int): Int {
    val divisionNumber: Int = number / 5;
    return (divisionNumber * 5) + 5
}
