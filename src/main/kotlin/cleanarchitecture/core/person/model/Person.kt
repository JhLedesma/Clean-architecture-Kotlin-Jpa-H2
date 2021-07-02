package cleanarchitecture.core.person.model

import cleanarchitecture.core.book.model.Book
import cleanarchitecture.core.film.model.Film

data class Person(
    val dni: Long,
    val name: String,
    val book: Book,
    val film: Film
)

data class PersonInput(
    val dni: Long,
    val name: String,
    val isbn: String,
    val title: String
)













