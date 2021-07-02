package mvc.service.dto

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