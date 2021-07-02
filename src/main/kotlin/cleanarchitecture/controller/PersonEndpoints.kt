package cleanarchitecture.controller

import cleanarchitecture.core.person.model.Person
import cleanarchitecture.core.person.model.PersonInput
import cleanarchitecture.core.person.service.PersonService

class PersonEndpoints(private val personService: PersonService) {

    fun createPerson(personInput: PersonInput): Person =
        personService.createPerson(personInput)

    fun getPerson(dni: Long): Person =
        personService.getPerson(dni)

    fun getPeople(): List<Person> =
        personService.getPeople()
}

