package br.edu.ifms.infrastructure.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.edu.ifms.application.usecase.ImportarAlunosCsvUseCase;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/alunos")
@RequiredArgsConstructor
public class AlunoController {

  private final ImportarAlunosCsvUseCase importarAlunosCsv;

  @PostMapping("/import")
  public ResponseEntity<String> importCsv(@RequestParam("file") MultipartFile multipartFilefile) {
    if (multipartFilefile.isEmpty()) {
      return ResponseEntity.badRequest().body("Por favor selecione um arquivo válido (CSV)");
    }

    try {
      importarAlunosCsv.execute(multipartFilefile.getInputStream());
      return ResponseEntity.ok("Processamento do CSV inciado com sucesso");

    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
          .body("Erro ao processar o arquivo: " + e.getMessage());
    }
  }
}
