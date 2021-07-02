package mvc.exception

data class DemoAppException(override val message: String = "", val code: Int) : RuntimeException(message)
data class ClientServerException(override val message: String = "") : RuntimeException(message)
data class BadRequestException(override val message: String = "") : RuntimeException(message)
data class ResourceNotFoundException(override val message: String = "") : RuntimeException(message)