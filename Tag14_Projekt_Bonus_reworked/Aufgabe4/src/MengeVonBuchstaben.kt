// Todo: Gegeben ist ein Liebesgedicht gedicht in Form eines Strings. Ihr sollt eine Funktion schreiben, welche diesen
//  String übergeben bekommt.
//  Eure Funktion kennt bereits euren Namen.
//  Die Funktion schaut wie oft welcher Buchstabe aus eurem Namen in dem übergebenen String vorkommt. Und gibt dazu die
//  Ergebnisse an den Benutzer über println() ab.
//  Kotlin unterscheidet zwischen groß und kleinschreibung. Das wollen wir nicht. Deswegen müsst ihr erstmal alle
//  strings in Kleinschreibung verändern.
//  Tipp: Hierfür benötigt ihr vermutlich die Funktionen .lowercase() und filter()

//TODO : Schreibe deine Funktion hier...

fun gedicht(): String {
    var myName = "Maja"
    return myName.lowercase()
}

fun main() {
    val gedicht : String = "Der erste Blick\n" +
            "\n" +
            "Ich hatte Dich vorher noch nie gesehen,\n" +
            "beim ersten Blick war es geschehen.\n" +
            "\n" +
            "Mit diesem Moment hat sich alles gedreht,\n" +
            "meine Sorgen waren wie weggeweht.\n" +
            "\n" +
            "Mein Herz schlug plötzlich immer schneller,\n" +
            "mein Mut sank aber in den Keller.\n" +
            "\n" +
            "Dennoch will ich verlieren keine Zeit,\n" +
            "ich bin für diesen Schritt bereit.\n" +
            "\n" +
            "Du hast nicht nur mein Lächeln erhellt,\n" +
            "sondern mein Leben auf den Kopf gestellt.\n" +
            "\n" +
            "Ich liebe Dich, das sage ich Dir,\n" +
            "mit diesen Worten jetzt und hier."

    var lowerCase = gedicht.lowercase()
    var gefiltert = lowerCase.filter {it in gedicht()}
    var buchstabenGezaehlt = gefiltert.count()

//    println(lowerCase)
//    println(gefiltert)
//    println(buchstabenGezaehlt)
    //TODO : Bereinige das erste Wort in dem String.


    var removeFirstWord = gedicht.removeRange(0..3)

    println(gedicht)
    println("")
    println("")
    println(removeFirstWord)


}