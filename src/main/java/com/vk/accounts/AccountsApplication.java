package com.vk.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices REST API Documentation",
				description = "Banking Demo microservice  REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Vaibhav Kalyankar",
						email = "vaibhavkn43@gmail.com",
						url = "https://test.vk.in"

				),
				license = @License(
						name = "Apache 2.0",
						url = "https://test.vk.in"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Banking Demo microservice  REST API Documentation",
				url = "https://test.vk.in"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
