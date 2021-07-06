package cleanarchitecture.infraestructure.repository.adapter

import cleanarchitecture.core.person.model.Person
import cleanarchitecture.core.person.port.PersonRepository
import cleanarchitecture.infraestructure.repository.dao.PersonDao
import cleanarchitecture.infraestructure.shared.ModelMapper
import org.springframework.data.repository.findByIdOrNull

class PersonAdapterRepository(private val personDao: PersonDao, private val modelMapper: ModelMapper): PersonRepository {

    override fun save(person: Person): Person {
        return personDao.save(modelMapper.toEntity(person)).let { modelMapper.toDto(it) }
    }

    override fun findByDni(dni: Long): Person? {
        return personDao.findByIdOrNull(dni)?.let { modelMapper.toDto(it) }
    }

    override fun findAll(): List<Person> {
        return personDao.findAll().map { modelMapper.toDto(it) }
    }
}