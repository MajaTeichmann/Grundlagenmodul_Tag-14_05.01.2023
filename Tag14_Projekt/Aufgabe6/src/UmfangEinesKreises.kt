//todo: Schreibe eine Funktion, welche als Parameter den Radius eines Kreises als Double erhält, den Umfang des Kreises berechnet und das Ergebnis zurückgibt. Hierfür benötigt ihr die Konstante PI aus dem math-package.
// Der Umfang eines Kreises berechnet man so:
// Formel: Umfang = 2 * PI * Radius
// PI ist eine Konstante vom Typ Double.
// Nachdem man das math-Package importiert hat, kann man einfach auf die Konstante PI zugreifen, wie man auf
// selbsterstelle Konstanten zugegriffen hat. Ein Beispiel.
// val piMalZwei: Double = PI * 2  // Ist gleich 6.283185307179586
// 1. Importiere hierfür zuerst das richtige Package.
// 2. Schreibe die Funktion, verwende dabei die Formel.
// 3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit dem Wert 5.5 aufrufst und das Ergebnis in der
// Konsole mit der println()-Funktion ausgibst. Wird in etwa 34.55 ausgegeben?
// (Das Ergebnis kann sich bei verschiedenen Computern ein kleines bisschen unterscheiden, deswegen vergleichen wir nur
// bis zur 2. Nachkommastelle)

import kotlin.math.PI
import kotlin.math.round
import kotlin.math.roundToLong

fun main() {
    circle(5.5)
}

fun circle(radius: Double){
    val formula = 2* PI * radius
    println(formula)
}