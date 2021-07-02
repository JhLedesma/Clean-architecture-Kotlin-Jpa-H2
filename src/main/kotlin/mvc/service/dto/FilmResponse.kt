package mvc.service.dto

data class FilmResponse(
    val query: String,
    val results: List<Result>
)

data class Result(
    val id: String,
    val numberOfEpisodes: Int,
    val runningTimeInMinutes: Int,
    val seriesEndYear: Int,
    val seriesStartYear: Int,
    val title: String?,
    val titleType: String?
)