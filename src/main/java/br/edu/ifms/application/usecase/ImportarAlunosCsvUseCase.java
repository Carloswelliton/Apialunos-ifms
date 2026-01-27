package br.edu.ifms.application.usecase;

import java.util.List;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;
import br.edu.ifms.domain.service.AlunoCsvReader;

public class ImportarAlunosCsvUseCase {

  private final AlunoCsvReader csvReader;
  private final AlunoRepository repository;

  public ImportarAlunosCsvUseCase(
      AlunoCsvReader csvReader,
      AlunoRepository repository) {
    this.csvReader = csvReader;
    this.repository = repository;
  }

  public void executar(String pathFile) {
    List<AlunoModel> alunos = csvReader.ler(pathFile);
    repository.salvar(alunos);
  }
}
