class FoldablePhone : Phone() {

    var isFolded = false


    override fun switchOn() {
        if (!isFolded){
            isScreenLightOn = true
        }
        println("is phone light on? $isScreenLightOn is phone folded $isFolded")
    }

    fun foldPhone(){
        if (!isFolded){
            isScreenLightOn = false
            isFolded = true
        }
        println("is phone light on? $isScreenLightOn is phone folded $isFolded")
    }

    fun unFoldPhone(){
        if (isFolded){
            isScreenLightOn = true
            isFolded = false
        }
        println("is phone light on? $isScreenLightOn is phone folded $isFolded")
    }
}
