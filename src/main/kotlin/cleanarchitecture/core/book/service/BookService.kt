package cleanarchitecture.core.book.service

import cleanarchitecture.client.BookClient
import cleanarchitecture.core.book.model.Book

class BookService(private val bookClient: BookClient) {

    fun getBook(isbn: String): Book =
        bookClient.getBookResponse(isbn)
            .items
            .firstOrNull()
            ?.volumeInfo
            ?.let { Book(isbn, it.title, it.authors.first(), it.publisher, it.publishedDate, it.categories.first()) }
            ?: throw RuntimeException("Not exist Items for isbn: $isbn")
}



