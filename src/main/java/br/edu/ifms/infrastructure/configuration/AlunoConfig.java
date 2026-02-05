package br.edu.ifms.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.edu.ifms.application.usecase.ImportarAlunosCsvUseCase;
import br.edu.ifms.application.usecase.ListarAlunosUseCase;
import br.edu.ifms.domain.repository.AlunoRepository;
import br.edu.ifms.domain.service.AlunoCsvReader;

@Configuration
public class AlunoConfig {

  @Bean
  public ImportarAlunosCsvUseCase importarAlunosCsv(AlunoRepository repository, AlunoCsvReader reader) {
    return new ImportarAlunosCsvUseCase(repository, reader);
  }

  @Bean
  public ListarAlunosUseCase listarAlunosUseCase(AlunoRepository alunoRepository) {
    return new ListarAlunosUseCase(alunoRepository);
  }

}
