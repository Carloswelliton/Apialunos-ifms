package br.edu.ifms.domain.model;

public class AlunoModel {

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

  public AlunoModel(Long id, String campus, String polo, String coordenacao, String curso, String nomeEstudante,
      String situacao, Integer idade, String sexo, String emailInstitucional, String periodoEntrada, String turno,
      String cep) {
    this.id = id;
    this.campus = campus;
    this.polo = polo;
    this.coordenacao = coordenacao;
    this.curso = curso;
    this.nomeEstudante = nomeEstudante;
    this.situacao = situacao;
    this.idade = idade;
    this.sexo = sexo;
    this.emailInstitucional = emailInstitucional;
    this.periodoEntrada = periodoEntrada;
    this.turno = turno;
    this.cep = cep;
  }

  public AlunoModel() {
  };

  public Long getId() {
    return id;
  }

  public String getCampus() {
    return campus;
  }

  public String getPolo() {
    return polo;
  }

  public String getCoordenacao() {
    return coordenacao;
  }

  public String getCurso() {
    return curso;
  }

  public String getNomEstudante() {
    return nomeEstudante;
  }

  public String getSituacao() {
    return situacao;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getSexo() {
    return sexo;
  }

  public String getEmailInstitucional() {
    return emailInstitucional;

  }

  public String getPeriodoEntrada() {
    return periodoEntrada;
  }

  public String getTurno() {
    return turno;
  }

  public String getCep() {
    return cep;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setCampus(String campus) {
    this.campus = campus;
  }

  public void setPolo(String polo) {
    this.polo = polo;
  }

  public void setCoordenacao(String coordenacao) {
    this.coordenacao = coordenacao;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public void setNomeEstudante(String nomeEstudante) {
    this.nomeEstudante = nomeEstudante;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setEmailInstitucional(String emailInstitucional) {
    this.emailInstitucional = emailInstitucional;
  }

  public void setPeriodoEntrada(String periodoEntrada) {
    this.periodoEntrada = periodoEntrada;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

}
