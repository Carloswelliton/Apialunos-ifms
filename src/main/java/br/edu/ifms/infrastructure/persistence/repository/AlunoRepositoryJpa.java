package br.edu.ifms.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.repository.AlunoRepository;
import br.edu.ifms.infrastructure.persistence.entity.AlunoEntity;
import br.edu.ifms.infrastructure.persistence.mapper.AlunoMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AlunoRepositoryJpa implements AlunoRepository {

  private final AlunoSpringDataRepository dataRepository;
  private final AlunoMapper mapper;

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
    AlunoEntity alunoNovo = mapper.toEntity(alunoModel);
    AlunoEntity alunoSalvo = dataRepository.save(alunoNovo);
    return mapper.toModel(alunoSalvo);
  }

}
