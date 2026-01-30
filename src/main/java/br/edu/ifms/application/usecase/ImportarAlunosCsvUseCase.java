package br.edu.ifms.application.usecase;

import java.io.InputStream;
import java.util.List;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;
import br.edu.ifms.domain.service.AlunoCsvReader;

public class ImportarAlunosCsvUseCase {

  private AlunoRepository repository;
  private AlunoCsvReader reader;

  public ImportarAlunosCsvUseCase(AlunoRepository repository, AlunoCsvReader reader) {
    this.repository = repository;
    this.reader = reader;
  }

  public void execute(InputStream dados) {
    List<AlunoModel> alunos = reader.ler(dados);

    for (AlunoModel alunoModel : alunos) {
      if (repository.existePorEmail(alunoModel.getEmailInstitucional())) {
        System.out.println("Aluno ja cadastrado no banco de dados " + alunoModel.getEmailInstitucional());
        continue;
      }

      repository.salvar(alunoModel);

    }
  }
}
