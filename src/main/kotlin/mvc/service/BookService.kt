package mvc.service

import mvc.client.BookClient
import mvc.repository.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BookService(@Autowired private val bookClient: BookClient) {

    fun getBook(isbn: String): Book =
        bookClient.getBookResponse(isbn)
            .items
            .firstOrNull()
            ?.volumeInfo
            ?.let { Book(isbn, it.title, it.authors.first(), it.publisher, it.publishedDate, it.categories.first()) }
            ?: throw RuntimeException("Not exist Items for isbn: $isbn")
}



