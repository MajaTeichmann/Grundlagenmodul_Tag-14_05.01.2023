// todo: Erstelle eine Funktion, die einen Integer als Parameter bekommt, den absoluten Betrag des Parameters berechnet
//  und das Ergebnis in der Konsole ausgibt.
//  Zur Erinnerung: der absolute Betrag einer Zahl ist die Zahl ohne ihr (negatives) Vorzeichen.
//  Z.B. der absolute Betrag von -6 ist 6 (aus Minus wird Plus),
//  der absolute Betrag von 10 ist 10 (Aus Plus bleibt Plus).
//  1. Importiere hierfür zuerst das math-Package.
//  2. Schreibe die Funktion.
//  3.Verwende zum Berechnen des absoluten Betrages die abs()-Funktion.
//  4.Prüfe deine Funktion, indem du sie in der main-Funktion mit dem Wert -42 aufrufst. Kommt 42 raus?
//  Prüfe deine Funktion ebenfalls indem du sie mit 20 aufrufst. Kommt 20 raus?

import kotlin.math.*
fun main() {
    absFunction(-42)
    absFunction(20)
}

fun absFunction(number: Int){
    val absNumber = abs(number)
    println(absNumber)
}