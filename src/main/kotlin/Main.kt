fun main() {
    val countryRussia = Country("RUSSIA", 150_000_000)
    println(countryRussia.name)
    countryRussia.population = 151_000_000
    println(countryRussia.population)

    val countryUkraine = Country() // вызов secondary конструктора без параметров ("", 0)
    println("Ukraine: ${countryUkraine.name}")

    val book = Book("Book")
    book.price = 100
    book.year = 1998

}