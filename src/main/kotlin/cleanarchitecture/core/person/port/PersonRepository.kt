package cleanarchitecture.core.person.port

import cleanarchitecture.core.person.model.Person

interface PersonRepository {

    fun save(person: Person): Person
    fun findByDni(dni: Long): Person?
    fun findAll(): List<Person>
}