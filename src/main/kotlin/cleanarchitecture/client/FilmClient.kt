package cleanarchitecture.client

import cleanarchitecture.core.film.model.FilmResponse


interface FilmClient {
    fun getFilmResponse(title: String): FilmResponse
}

