package br.edu.ifms.domain.exception;

public class AlunoNaoEncontradoExecption extends RuntimeException {

  public AlunoNaoEncontradoExecption(String mensagem) {
    super(mensagem);
  }
}
