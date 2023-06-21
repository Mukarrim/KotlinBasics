fun main(args : Array<String>) {
    data class Movies(var movieName: String, val movieDes: String)

    var movies= Movies("Joker", "abc" )

    println(movies.toString())
    movies.movieName= "Interstellar"

    println(movies.movieName)

}