package br.edu.ifms.application.usecase;

import java.util.List;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;

public class ListarAlunosUseCase {

  private final AlunoRepository alunoRepository;

  public ListarAlunosUseCase(AlunoRepository alunoRepository) {
    this.alunoRepository = alunoRepository;
  }

  public List<AlunoModel> execute() {
    return alunoRepository.listar();
  }
}
