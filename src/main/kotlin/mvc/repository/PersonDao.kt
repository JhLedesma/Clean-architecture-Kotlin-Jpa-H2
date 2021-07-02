package mvc.repository

import mvc.repository.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDao : JpaRepository<Person, Long>