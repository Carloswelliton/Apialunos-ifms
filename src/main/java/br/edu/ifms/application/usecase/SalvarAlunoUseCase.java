package br.edu.ifms.application.usecase;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;

public class SalvarAlunoUseCase {

  private final AlunoRepository alunoRepository;

  public SalvarAlunoUseCase(AlunoRepository alunoRepository) {
    this.alunoRepository = alunoRepository;
  }

  public AlunoModel salvarAluno(AlunoModel alunoModel) {
    return alunoRepository.salvar(alunoModel);
  }

}
