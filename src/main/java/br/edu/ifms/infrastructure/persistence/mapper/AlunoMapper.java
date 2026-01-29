package br.edu.ifms.infrastructure.persistence.mapper;

import org.springframework.stereotype.Component;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.infrastructure.persistence.entity.AlunoEntity;

@Component
public class AlunoMapper {

  public AlunoEntity toEntity(AlunoModel model) {
    if (model == null)
      return null;

    AlunoEntity aluno = new AlunoEntity();
    aluno.setId(model.getId());
    aluno.setCampus(model.getCampus());
    aluno.setPolo(model.getPolo());
    aluno.setCoordenacao(model.getCoordenacao());
    aluno.setCurso(model.getCurso());
    aluno.setNomeEstudante(model.getNomEstudante());
    aluno.setSituacao(model.getSituacao());
    aluno.setIdade(model.getIdade());
    aluno.setSexo(model.getSexo());
    aluno.setEmailInstitucional(model.getEmailInstitucional());
    aluno.setPeriodoEntrada(model.getPeriodoEntrada());
    aluno.setTurno(model.getTurno());
    aluno.setCep(model.getCep());
    return aluno;
  }

  public AlunoModel toModel(AlunoEntity entity) {
    if (entity == null)
      return null;

    return new AlunoModel(
        entity.getId(),
        entity.getCampus(),
        entity.getPolo(),
        entity.getCoordenacao(),
        entity.getCurso(),
        entity.getNomeEstudante(),
        entity.getSituacao(),
        entity.getIdade(),
        entity.getSexo(),
        entity.getEmailInstitucional(),
        entity.getPeriodoEntrada(),
        entity.getTurno(),
        entity.getCep()

    );
  }
}
