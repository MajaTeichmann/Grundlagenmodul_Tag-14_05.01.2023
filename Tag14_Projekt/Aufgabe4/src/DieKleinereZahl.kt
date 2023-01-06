//todo: Erstelle eine Funktion, die zwei Double als Parameter bekommt, die kleinere von den zwei Zahlen bestimmt und
// das Ergebnis in der Konsole ausgibt.
// 1. Importiere hierfür zuallererst das richtige Package.
// 2. Schreibe die Funktion.
// 3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit den Werten 123.45 und 5.67 aufrufst. Wird 5.67 ausgegeben?

import kotlin.comparisons.minOf
fun main(){
    val result = getSmallestNumber(123.45,5.67)
    println(result)
}

//fun getSmallestNumber(number1: Double, number2: Double){
//    val smallestNumber = number1<number2
//    println(smallestNumber)
//}

fun getSmallestNumber(number1: Double, number2: Double):Double{
    var smallestNumber = minOf(number1, number2)
    return smallestNumber
}
