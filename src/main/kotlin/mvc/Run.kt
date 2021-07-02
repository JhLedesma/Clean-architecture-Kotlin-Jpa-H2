package mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.client.RestTemplate
import java.time.Duration

@SpringBootApplication
@EnableJpaRepositories("mvc.repository")
@EntityScan("mvc.repository")
class Run {

    @Bean
    fun restTemplate(): RestTemplate = RestTemplateBuilder().setConnectTimeout(Duration.ofMillis(10000)).build()
}

fun main(args: Array<String>) {
    runApplication<Run>(*args)
}



