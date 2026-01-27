package br.edu.ifms.domain.exception;

public class PermissaoNegadaException extends RuntimeException {

  public PermissaoNegadaException(String mensagem) {
    super(mensagem);
  }
}
