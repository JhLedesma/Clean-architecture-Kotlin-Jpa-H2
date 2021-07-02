package cleanarchitecture.repository.model

import javax.persistence.*

@Entity
@Table(name = "book")
data class BookEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val isbn: String,
    val title: String,
    val author: String,
    val publisher: String,
    val publishedDate: String,
    val category: String
)