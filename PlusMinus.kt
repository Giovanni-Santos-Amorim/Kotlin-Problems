/*
hackerrank
*/

fun plusMinus(arr: Array<Int>): Unit {
    var positif = 0
    var negatif = 0
    var zero = 0
    val sizeData = arr.size.toFloat()
    arr.forEach { it ->
        if (it > 0) {
            positif++
        } else if (it < 0) {
            negatif++
        } else {
            zero++
        }
    }
    println(positif.toFloat() / sizeData)
    println(negatif.toFloat() / sizeData)
    println(zero.toFloat() / sizeData)
}