package mvc.controller

import mvc.controller.dto.PersonInput
import mvc.repository.model.Person
import mvc.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
class PersonController(private val personService: PersonService) {

    @PostMapping("/people")
    fun createPerson(@RequestBody personInput: PersonInput) =
        personService.createPerson(personInput)

    @GetMapping("/people/{dni}")
    fun getPerson(@PathVariable dni: Long): Person =
        personService.getPerson(dni)

    @GetMapping("/people")
    fun getPeople(): List<Person> =
        personService.getPeople()
}