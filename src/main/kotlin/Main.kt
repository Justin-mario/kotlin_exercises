fun main() {
    val morningNotification = 51
    val eveningNotification = 135
//
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

//    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
//    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

    val organise = Song("organise", "Asake", 2020, 999)
//    organise.printSongDescription()
//    organise.printSongPopularity()

    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

//    amanda.showProfile()
//    atiqah.showProfile()

    val samsungA7 = FoldablePhone()
    samsungA7.switchOn()
    samsungA7.foldPhone()
    samsungA7.unFoldPhone()


}


fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages in 0..99){
        println("you have $numberOfMessages notifications.")
    }else{
        println("your phone is blowing up! you have 99+ notifications.")
    }
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    val price = when(age){
         in 0..12 -> 15
         in 13..60,  -> when { isMonday -> 25 else -> 30 }
         in 61..100 -> 20
         else -> -1
    }
    return price
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}