package mvc.controller.dto

data class PersonInput(
    val dni: Long,
    val name: String,
    val isbn: String,
    val title: String
)