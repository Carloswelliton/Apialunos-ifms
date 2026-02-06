package br.edu.ifms.infrastructure.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("API Alunos IFMS")
            .version("1.0"))
        // Adicione esta seção de servers
        .servers(List.of(
            new Server().url("https://apialunos-ifms-production.up.railway.app").description("Servidor de Produção"),
            new Server().url("http://localhost:8080").description("Servidor Local")))
        .addSecurityItem(new SecurityRequirement().addList("BasicAuth"))
        .components(new Components()
            .addSecuritySchemes("BasicAuth",
                new SecurityScheme()
                    .type(SecurityScheme.Type.HTTP)
                    .scheme("basic")));
  }
}
