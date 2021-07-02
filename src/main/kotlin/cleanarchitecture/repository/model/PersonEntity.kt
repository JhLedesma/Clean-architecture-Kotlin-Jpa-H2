package cleanarchitecture.repository.model

import javax.persistence.*

@Entity
@Table(name = "person")
data class PersonEntity(
    @Id
    val dni: Long,
    val name: String,
    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval=true)
    val book: BookEntity,
    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval=true)
    val film: FilmEntity
)