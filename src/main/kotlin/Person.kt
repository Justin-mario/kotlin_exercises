class Person(private val name: String, private val age: Int, private val hobby: String?, private val referrer: Person?) {



    fun showProfile(){
        print("Name: $name\nAge: $age\nLikes to $hobby." +
                " ${if(referrer == null) "Doesn't have a referrer." else "Has a referrer named ${referrer.name}," +
                        " who likes to ${referrer.hobby}."}\n\n")

    }
}