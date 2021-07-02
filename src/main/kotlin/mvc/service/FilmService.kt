package mvc.service

import mvc.client.FilmClient
import mvc.repository.model.Film
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FilmService(@Autowired private val filmClient: FilmClient) {

    fun getFilm(title: String): Film =
        filmClient.getFilmResponse(title)
            .results
            .firstOrNull { !it.title.isNullOrEmpty() || !it.titleType.isNullOrEmpty() }
            ?.let {
                Film(
                    title,
                    it.seriesStartYear,
                    it.seriesEndYear,
                    it.numberOfEpisodes,
                    it.runningTimeInMinutes
                )
            }
            ?: throw RuntimeException("Not exist results for title: $title")
}

