package br.edu.ifms.domain.service;

import java.io.InputStream;
import java.util.List;

import br.edu.ifms.domain.model.AlunoModel;

public interface AlunoCsvReader {

  List<AlunoModel> ler(InputStream inputStream);
}
