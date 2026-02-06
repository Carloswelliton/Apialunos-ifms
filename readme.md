# 🎓 API Alunos IFMS

Esta é uma API RESTful robusta desenvolvida para gerenciar o processo de importação e consulta de dados de alunos. O projeto utiliza os princípios da **Clean Architecture** (Arquitetura Limpa), garantindo que as regras de negócio sejam independentes de frameworks, bancos de dados ou qualquer agente externo.

---

## 📖 Documentação Interativa (Swagger)

A API conta com documentação automática e interativa via **Swagger UI (OpenAPI 3)**. Através dela, é possível visualizar todos os modelos de dados e testar os endpoints diretamente pelo navegador.

* **URL Local:** `http://localhost:8080/swagger-ui/index.html`
* **URL Produção:** `https://apialunos-ifms-production.up.railway.app/swagger-ui/index.html`

> **Nota:** Como a API utiliza **Basic Auth**, clique no botão **"Authorize"** no topo da página do Swagger e insira suas credenciais para liberar os testes nos endpoints.

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma estrutura desacoplada para facilitar a manutenção e escalabilidade:



* **Domain (Domínio):** Onde reside o "Core" da aplicação: entidades principais (`AlunoModel`), interfaces de repositório e regras de negócio puras.
* **Application (Aplicação):** Implementa os Casos de Uso (`ImportarAlunosCsvUseCase`, `ListarAlunosUseCase`), mediando a comunicação entre o mundo externo e o domínio.
* **Infrastructure (Infraestrutura):** Contém os detalhes técnicos: persistência JPA (PostgreSQL), Mappers, segurança (Spring Security) e adaptadores Web (Controllers).

---

## 🚀 Tecnologias e Ferramentas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3.4+
* **Documentação:** SpringDoc OpenAPI 2.x (Swagger)
* **Segurança:** Spring Security (Basic Auth)
* **Persistência:** Spring Data JPA & PostgreSQL
* **Leitura de Arquivos:** OpenCSV
* **Deploy:** Railway

---

## 🛠️ Endpoints Disponíveis

A URL base em produção é: `https://apialunos-ifms-production.up.railway.app/api/v1`

### 1. Listar Alunos Cadastrados
Retorna a lista completa de alunos convertidos para o modelo de domínio.
* **URL:** `/alunos/find`
* **Método:** `GET`

### 2. Importação Massiva via CSV
Recebe um arquivo `.csv` via `multipart/form-data`.
* **URL:** `/alunos/import`
* **Método:** `POST`
* **Regra de Negócio:** O sistema valida a existência do aluno via **e-mail institucional** antes de salvar, evitando registros duplicados mesmo em múltiplas execuções.

---

## 📊 Estrutura do Arquivo CSV

Para garantir o sucesso da importação, o arquivo deve seguir este formato:

| Coluna | Descrição |
| :--- | :--- |
| **campus** | Campus do IFMS |
| **polo** | Polo de apoio |
| **coordenacao** | Coordenação responsável |
| **curso** | Nome do curso |
| **nomeEstudante** | Nome completo do aluno |
| **situacao** | Situação da matrícula |
| **idade** | Idade (valor numérico) |
| **sexo** | Sexo do aluno |
| **emailInstitucional** | E-mail único (Chave de validação) |
| **periodoEntrada** | Semestre/Ano de ingresso |
| **turno** | Matutino, Vespertino ou Noturno |
| **cep** | CEP de residência |
---

## ⚙️ Instalação e Execução Local

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/apialunos-ifms.git](https://github.com/seu-usuario/apialunos-ifms.git)
    ```
2.  **Configuração de Banco de Dados:**
    Ajuste as propriedades de conexão (PostgreSQL ou H2) no arquivo `src/main/resources/application.properties`.
3.  **Execução:**
    ```bash
    mvn spring-boot:run
    ```

---

## 🔒 Segurança

A segurança é implementada via **Basic Authentication**. Em ambiente de produção, certifique-se de enviar o Header `Authorization` com as credenciais codificadas em Base64.

---

Desenvolvido com ☕ por **Carlos Welliton**
