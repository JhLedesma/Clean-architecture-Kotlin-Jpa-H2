package cleanarchitecture.repository.model

import javax.persistence.*

@Entity
@Table(name = "film")
data class FilmEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val title: String,
    val seriesStartYear: Int,
    val seriesEndYear: Int,
    val numberOfEpisodes: Int,
    val runningTimeInMinutes: Int
)