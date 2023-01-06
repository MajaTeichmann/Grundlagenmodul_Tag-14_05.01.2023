//Todo: In unserem zungenbrecher String hat sich leider ein Fehler im ersten Wort eingeschlichen.
// Anstelle von Aslronaul sollte eigentlich Astronaut stehen.
// Schreibe eine Funktion, welche den String zungenbrecher entgegennimmt, das erste Wort berichtigt und dann die
// Eingabe verbessert wieder zurückgibt.
// Allerdings sollt ihr hier primär mit Funktionen arbeiten und nicht einfach die einzelnen Indizes manuell verändern.
// Wo wäre sonst auch die Herausforderung :).
// Hilfreich ist hier, dass Strings intern wie Listen von Chars behandelt werden. Also kann man viele der
// Listenfunktionen auf Strings anwenden.
// hilfreiche Funktionen hier sind : .indexOf() .slice() .replace() .substring()

//TODO : Schreibe deine Funktion hier...


fun main() {
    val zungenbrecher : String = "Aslronaulen kauten und kauten während sie blaugrüne Mondsteine klaubten."
    //TODO : Bereinige das erste Wort in dem String.
    var sliced = zungenbrecher.slice(0..10)
    var replacedZungenbrecher = sliced.replace('l','t')
    println(replacedZungenbrecher)
}