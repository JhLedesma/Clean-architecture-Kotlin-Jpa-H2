package cleanarchitecture.repository.dao

import cleanarchitecture.repository.model.PersonEntity
import mvc.repository.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonDao : JpaRepository<PersonEntity, Long>