package mvc.repository.model

import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    val dni: Long,
    val name: String,
    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval=true)
    val book: Book,
    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval=true)
    val film: Film
)