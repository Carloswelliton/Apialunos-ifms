package br.edu.ifms.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String campus;
  private String polo;
  private String coordenacao;
  private String curso;
  private String nomeEstudante;
  private String situacao;
  private Integer idade;
  private String sexo;
  private String emailInstitucional;
  private String periodoEntrada;
  private String turno;
  private String cep;
}
