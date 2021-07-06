package cleanarchitecture.core.film.port

import cleanarchitecture.core.film.model.FilmResponse


interface FilmClient {
    fun getFilmResponse(title: String): FilmResponse
}

