package mvc.service

import mvc.controller.dto.PersonInput
import mvc.repository.PersonDao
import mvc.repository.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PersonService(
    @Autowired private val bookService: BookService,
    @Autowired private val filmService: FilmService,
    @Autowired private val personRepository: PersonDao
) {

    fun createPerson(personInput: PersonInput): Person {
        val book = bookService.getBook(personInput.isbn)
        val film = filmService.getFilm(personInput.title)

        return personRepository.save(Person(personInput.dni, personInput.name, book, film))
    }

    fun getPerson(dni: Long): Person =
        personRepository.findByIdOrNull(dni)
            ?: throw RuntimeException("Not found person for dni: $dni")

    fun getPeople(): List<Person> =
        personRepository.findAll()
}

