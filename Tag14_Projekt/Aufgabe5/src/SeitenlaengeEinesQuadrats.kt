//todo: Schreibe eine Funktion, welche die Fläche eines Rechtecks als Double erhält und die Seitenlänge zurückgibt.
// Hierfür benötigt ihr die sqrt()-Funktion aus dem math-Package.
// Die Seitenlänge eines Quadrates kann man berechnen, indem man die Wurzel aus der Fläche zieht.
// Formel: Seitenlänge = sqrt(Fläche)
// 1. Importiere hierfür zuerst das richtige Package.
// 2. Schreibe die Funktion, verwende dabei die Formel.
// 3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit dem Wert 64.0 aufrufst und das Ergebnis in der
// Konsole mit der println()-Funktion ausgibst. Wird 8.0 ausgegeben?
// 4. Prüfe ebenfalls deine Funktion, indem du sie in der main()-Funktion mit dem Wert 1089.0 aufrufst und das Ergebnis
// in der Konsole mit der println()-Funktion ausgibst. Wird 33.0 ausgegeben?

import kotlin.math.sqrt
fun main() {
    areaRectangle(64.0)
    areaRectangle(1089.0)
}

fun areaRectangle(area: Double){
    val formula = sqrt(area)
    println(formula)
}