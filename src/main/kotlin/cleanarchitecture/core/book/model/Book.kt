package cleanarchitecture.core.book.model

data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    val publisher: String,
    val publishedDate: String,
    val category: String,
    val id: Long? = null
)

data class BookResponse(val items: List<Item>)

data class Item(val volumeInfo: VolumeInfo)

data class VolumeInfo(
    val authors: List<String>,
    val categories: List<String>,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifier>,
    val pageCount: Int,
    val publishedDate: String,
    val publisher: String,
    val title: String
)

data class IndustryIdentifier(
    val identifier: String,
    val type: String
)






