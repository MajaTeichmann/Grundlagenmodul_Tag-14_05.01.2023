//todo: Schreibe eine Funktion, welche zwei Seitenlängen a und b eines rechtwinkligen Dreiecks als Double erhält, die
// Seite c berechnet und die Seite c zurückgibt.
// Die Seiten a und b stehen im rechten Winkel zueinander.
// Hierfür benötigt ihr die sqrt() und pow() Funktion aus dem richtigen math-Package.
// Nach dem Satz des Pythagoras berechnet man die Länge der Seite c eines rechtwinkligen Dreiecks mithilfe der Länge der
// anderen Seiten a und b mit der Gleichung:
// c^2 = a^2 + b^2
// (Das ^ Zeichen steht für "hoch", z.B. 2^2 = 2 hoch 2)
// 1. Importiere hierfür zuerst das richtige Package.
// 2. Erstelle die Funktion, die zwei Seitenlängen a und b als Parameter vom Typ Double erhält und die dritte Seitenlänge
// c vom Typ Double als Rückgabewert zurückgibt.
// 3. berechne im Rumpf der Funktion die dritte Seitenlänge c mit der Formel in der Aufgabenstellung.
// 4. Gib das Ergebnis zurück.
// 5. Prüfe deine Funktion, indem du sie in der main()-Funktion mit den Werten 4.2 und 6.5 aufrufst und das Ergebnis in der
// Konsole ausgibst. Wird in etwa 7.73 ausgegeben?
// (Das Ergebnis kann sich bei verschiedenen Computern ein kleines bisschen unterscheiden, deswegen vergleichen wir nur
// bis zur 2. Nachkommastelle)
// 6. Prüfe deine Funktion ebenfalls mit den Werten 12.56 und 3.56. Kommt in etwa 13.05 raus?

import kotlin.math.sqrt
import kotlin.math.pow
fun main() {
    rectangle(4.2,6.5)
    rectangle(12.56,3.56)
}

fun rectangle(a: Double, b: Double){
    var sideA = a
    var sideB: Double = b
    var sideC: Double = sideA.pow(2)+sideB.pow(2) //c^2=a^2 + b^2
    var square = sideC
    var result: Double = sqrt(square)
    println(result)
}