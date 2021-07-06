package cleanarchitecture.infraestructure.repository.dao

import cleanarchitecture.infraestructure.repository.model.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PersonDao : JpaRepository<PersonEntity, Long>