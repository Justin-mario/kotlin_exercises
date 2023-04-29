class Song (private var title: String, private var artist: String, private var year: Int, private var playCount: Int) {

    var result =  when (playCount) {
        in 0..999 -> "unpopular"
        else -> "popular"
    }

    private var popularity = result







    fun printSongDescription(){
        println("[$title], performed by [$artist], was released in [$year].")
    }

    fun printSongPopularity(){
        println("this song is $popularity")
    }

}