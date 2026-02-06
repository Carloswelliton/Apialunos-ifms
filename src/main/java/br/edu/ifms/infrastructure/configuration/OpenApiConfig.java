package br.edu.ifms.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI customOpenApi() {
    return new OpenAPI()
        .info(new Info()
            .title("API de alunos do IFMS")
            .version("1.0")
            .description("Documentação da API de Alunos para consultas e importação de dados csv"))
        .addSecurityItem(new SecurityRequirement().addList("BasicAuth"))
        .components(new Components()
            .addSecuritySchemes("BasicAuth", new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("basic")));
  }
}
