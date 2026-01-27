package br.edu.ifms.application.usecase;

import java.util.Optional;

import br.edu.ifms.domain.exception.AlunoNaoEncontradoExecption;
import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;
import br.edu.ifms.domain.security.UsuarioAutenticadoService;

public class BuscarAlunoUseCase {

  private final AlunoRepository alunoRepository;

  public BuscarAlunoUseCase(AlunoRepository alunoRepository, UsuarioAutenticadoService usuarioAutenticado) {
    this.alunoRepository = alunoRepository;
  }

  public AlunoModel buscarPorMatricula(String matricula) {

    Optional<AlunoModel> alunoOpt = alunoRepository.findByMatricula(matricula);

    if (alunoOpt.isEmpty()) {
      throw new AlunoNaoEncontradoExecption("Matricula do estudante não encontrado");
    }

    AlunoModel aluno = alunoOpt.get();

    return aluno;
  }
}
