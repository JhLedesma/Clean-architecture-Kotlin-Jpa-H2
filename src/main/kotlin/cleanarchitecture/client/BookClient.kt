package cleanarchitecture.client

import cleanarchitecture.core.book.model.BookResponse

interface BookClient {
    fun getBookResponse(isbn: String): BookResponse
}

