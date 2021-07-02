package mvc.repository.model

import javax.persistence.*

@Entity
@Table(name = "film")
data class Film(
    val title: String,
    val seriesStartYear: Int,
    val seriesEndYear: Int,
    val numberOfEpisodes: Int,
    val runningTimeInMinutes: Int,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
)