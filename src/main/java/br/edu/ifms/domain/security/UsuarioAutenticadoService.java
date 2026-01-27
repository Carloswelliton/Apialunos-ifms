package br.edu.ifms.domain.security;

public interface UsuarioAutenticadoService {

  boolean isServidor();

  boolean isEstudante();

  String getEmailUsuario();
}
