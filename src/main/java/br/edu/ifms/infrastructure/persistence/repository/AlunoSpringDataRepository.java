package br.edu.ifms.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.infrastructure.persistence.entity.AlunoEntity;

public interface AlunoSpringDataRepository extends JpaRepository<AlunoEntity, Long> {

}
