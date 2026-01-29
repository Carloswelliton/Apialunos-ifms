package br.edu.ifms.application.usecase;

import java.io.InputStream;
import java.util.List;

import br.edu.ifms.domain.exception.AlunoJaCadastradoException;
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
      try {
        if (repository.findByEmailInstitucional(alunoModel.getEmailInstitucional()).isEmpty()) {
          repository.salvar(alunoModel);
        } else {
          throw new AlunoJaCadastradoException("Email: " + alunoModel.getEmailInstitucional() + " já cadastrado");
        }
      } catch (Exception e) {
        throw new RuntimeException("Não foi possível ler a fonte de dados");
      }
    }
  }
}
