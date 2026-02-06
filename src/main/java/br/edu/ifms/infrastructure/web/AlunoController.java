package br.edu.ifms.infrastructure.web;

import java.util.List;

import org.springframework.http.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.edu.ifms.application.usecase.ImportarAlunosCsvUseCase;
import br.edu.ifms.application.usecase.ListarAlunosUseCase;
import br.edu.ifms.domain.model.AlunoModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/alunos")
@RequiredArgsConstructor
@Tag(name = "Alunos", description = "Endpoints")
public class AlunoController {

  private final ImportarAlunosCsvUseCase importarAlunosCsv;
  private final ListarAlunosUseCase listarAlunosUseCase;

  @Operation(summary = "Imporat arquivo CSV", description = "Importa um arquivo CSV e cadastra alunos não duplicados")
  @PostMapping(value = "/import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public ResponseEntity<String> importCsv(@RequestPart("file") MultipartFile multipartFilefile) {
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

  @Operation(summary = "Listar todos os alunos", description = "Rota que retornar todos os alunos cadastrados")
  @GetMapping("/find")
  public ResponseEntity<List<AlunoModel>> listarTodos() {
    List<AlunoModel> alunos = listarAlunosUseCase.execute();
    return ResponseEntity.ok(alunos);
  }
}
