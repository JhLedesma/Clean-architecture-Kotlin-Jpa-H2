package mvc.repository.model

import javax.persistence.*

@Entity
@Table(name = "book")
data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    val publisher: String,
    val publishedDate: String,
    val category: String,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
)