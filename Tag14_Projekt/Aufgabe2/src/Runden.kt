// TODO: In dieser Aufgabe soll die generelle Vorgehensweise verdeutlicht werden. Du kannst den Code selbst schreiben
//  oder ihn aus der Aufgabenbeschreibung kopieren.
//  Erstelle eine Funktion, die eine Zahl rundet und das Ergebnis in der Konsole ausgibt.
//  1. Importiere hierfür zuerst das math Package von Kotlin, indem du in der ersten Zeile der Datei
//  import kotlin.math.* schreibst.
//  2. Schreibe darunter dann die main()-Funktion:
//  3. Schreibe unter der main-Funktion dann die Funktion mit einem Double als Parameter.
//  4. Im Rumpf der Funktion rufen wir jetzt die round()-Funktion des math-Package mit dem Parameter auf und legen
//  das Ergebnis in einer Konstante ab.
//  5. Dann geben wir das Ergebnis in der Konsole aus.
//  6. Schlussendlich prüfen wir das Ergebnis, indem wir die Funktion mit der Zahl 123.45 aufrufen.
//  7. Wenn in der Konsole 123.0 ausgegeben wird, hast du die Funktion richtig erstellt.

import kotlin.math.*

//fun main(){
//    round(123.45)
//}
//
//fun round(number: Double){
//    val roundedNumber= round(number)
//    println(roundedNumber)
//}

fun main() {
    toRound(123.45)
}

fun toRound(number: Double) {
    val roundedNumber = round(number)
    println(roundedNumber)
}

// TODO: Copy Paste
//fun main() {
//    rundenUndAusgeben(123.45)
//}
//
//fun rundenUndAusgeben(zahl: Double) {
//    val gerundeteZahl = round(zahl)
//    println(gerundeteZahl)
//}