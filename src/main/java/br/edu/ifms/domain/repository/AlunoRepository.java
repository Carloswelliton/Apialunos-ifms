package br.edu.ifms.domain.repository;

import java.util.Optional;
import java.util.List;

import br.edu.ifms.domain.model.AlunoModel;

public interface AlunoRepository {

  AlunoModel salvar(AlunoModel alunoModel);

  List<AlunoModel> listar();

  Optional<AlunoModel> findByEmailInstitucional(String emailInstitucional);

  List<AlunoModel> listarPorCurso(String curso);

  boolean existePorEmail(String emailInstitucional);
}
