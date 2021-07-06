package cleanarchitecture.infraestructure.app.run

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = ["cleanarchitecture"])
@EnableJpaRepositories("cleanarchitecture.infraestructure")
@EntityScan("cleanarchitecture.infraestructure.repository")
class SpringRun

fun main(args: Array<String>) {
    runApplication<SpringRun>(*args)
}