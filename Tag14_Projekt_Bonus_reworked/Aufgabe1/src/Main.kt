////////////////////////////////////////////////////////////
// Bonusaufgabe: Message of the Day
////////////////////////////////////////////////////////////
// Wir wollen für unsere App eine Willkommensnachricht an
// den User schicken, eine sogenannte "Message of the day".
// Diese besteht aus Nutzernamen, Wetter und Stadt.
////////////////////////////////////////////////////////////


// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerNamen(): String {
    println("Geben Sie Ihren Benutzernamen ein: ")
    // TODO: lese über readln ein und returne den Nutzernamen
    var userName = readln()
    return userName
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerOrt(): String{
    println("Geben Sie Ihren Wohnort ein: ")
    // TODO: lese über readln ein und returne den Wohnort
    var userCity = readln()
    return userCity
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeTemperatur():Int{
    var temperaturen = listOf(23, 24, 29, 21, 25, -10)
// TODO: returne zufällige Temperatur aus der Liste
    return temperaturen.random()
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun printMessageOfTheDay(userName: String, weather: Int, city: String){
// TODO: nutze die Funktionen hole...() um die Variablen zu initialisieren
    var name = userName
    var temperatur = weather
    var ort = city

    var message = "Hallo $name! Es sind $temperatur Grad in $ort."

    println(message)
}

fun main() {
    printMessageOfTheDay(holeNutzerNamen(),holeTemperatur(),holeNutzerOrt())
}