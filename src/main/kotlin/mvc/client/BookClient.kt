package mvc.client

import mvc.exception.ClientServerException
import mvc.service.dto.BookResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class BookClient(@Value("\${book.host}") private val host:String, @Autowired private val restTemplate: RestTemplate) {

    fun getBookResponse(isbn: String): BookResponse =
        restTemplate.getForObject("$host/books/v1/volumes?q=isbn:$isbn", BookResponse::class.java)
            ?: throw ClientServerException("Not exist data for isbn: $isbn")
}