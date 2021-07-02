package mvc.client

import mvc.exception.ClientServerException
import mvc.service.dto.FilmResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class FilmClient(
    @Value("\${film.host}") private val host: String,
    @Value("\${film.api_key}") private val apiKey: String,
    @Value("\${film.host_key}") private val apiHost: String,
    @Autowired private val restTemplate: RestTemplate
) {
    fun getFilmResponse(title: String): FilmResponse {
        val entity = HttpEntity(null, HttpHeaders().also { it.set("x-rapidapi-key", apiKey) }.also { it.set("x-rapidapi-host", apiHost) })

        return restTemplate.exchange("$host/title/find?q=$title", HttpMethod.GET, entity, FilmResponse::class.java).body
            ?: throw ClientServerException("Not exist data for title: $title")
    }
}

