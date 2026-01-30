package br.edu.ifms.infrastructure.service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import br.edu.ifms.domain.model.AlunoModel;
import br.edu.ifms.domain.service.AlunoCsvReader;

@Component
public class OpenCsvReader implements AlunoCsvReader {

  @Override
  public List<AlunoModel> ler(InputStream inputStream) {
    List<AlunoModel> alunos = new ArrayList<>();

    try (CSVReader reader = new CSVReaderBuilder(new InputStreamReader(inputStream))
        .withSkipLines(1)
        .build()) {
      List<String[]> lines = reader.readAll();

      for (String[] columns : lines) {
        AlunoModel aluno = new AlunoModel(
            null,
            columns[0],
            columns[1],
            columns[2],
            columns[3],
            columns[4],
            columns[5],
            parseInteger(columns[6]),
            columns[7],
            columns[8],
            columns[9],
            columns[10],
            columns[11]

        );
        alunos.add(aluno);
      }
    } catch (Exception e) {
      throw new RuntimeException("Erro ao processar arquivo CVS: " + e.getMessage());
    }
    return alunos;
  }

  private Integer parseInteger(String value) {
    try {
      return (value != null && !value.isBlank()) ? Integer.parseInt(value.trim()) : null;
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
