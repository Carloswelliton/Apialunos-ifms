package br.edu.ifms.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;

public class AlunoRepositoryJpa implements AlunoRepository {

  @Override
  public Optional<AlunoModel> findByEmailInstitucional(String emailInstitucional) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  @Override
  public List<AlunoModel> listar() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<AlunoModel> listarPorCurso(String curso) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AlunoModel salvar(AlunoModel alunoModel) {
    // TODO Auto-generated method stub
    return null;
  }

}
