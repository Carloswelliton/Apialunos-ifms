# 🎓 API Alunos IFMS

Esta é uma API RESTful robusta desenvolvida para gerenciar o processo de importação e consulta de dados de alunos. O projeto utiliza os princípios da **Clean Architecture** (Arquitetura Limpa), garantindo que as regras de negócio sejam independentes de frameworks, bancos de dados ou qualquer agente externo.

---

## 🏗️ Arquitetura do Projeto

O projeto está organizado seguindo a separação de responsabilidades em camadas:

* **Domain (Domínio):** Contém as entidades principais (`AlunoModel`), interfaces de repositório e serviços. É o coração da aplicação.
* **Application (Aplicação):** Onde residem os Casos de Uso (`ImportarAlunosCsvUseCase`, `ListarAlunosUseCase`), orquestrando a lógica de negócio.
* **Infrastructure (Infraestrutura):** Implementações técnicas como persistência de dados (JPA), Mappers, configuração do Spring Security e adaptadores Web (Controllers).

---

## 🚀 Tecnologias e Ferramentas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3+
* **Segurança:** Spring Security (Autenticação Basic)
* **Persistência:** Spring Data JPA & PostgreSQL
* **Leitura de Arquivos:** OpenCSV
* **Produtividade:** Lombok & MapStruct (ou Mappers manuais)
* **Deploy:** Railway

---

## 🛠️ Endpoints Disponíveis

A URL base da aplicação em produção é:  
`https://apialunos-ifms-production.up.railway.app/api/v1`

### 1. Listar Alunos Cadastrados
Retorna a lista completa de alunos presentes no banco de dados.
* **URL:** `/alunos/find`
* **Método:** `GET`
* **Autenticação:** Requer Basic Auth.

### 2. Importação Massiva via CSV
Recebe um arquivo `.csv`, processa as linhas e salva no banco de dados.  
**Regra de Negócio:** O sistema realiza uma verificação automática de duplicidade baseada no **e-mail institucional**. Se o aluno já existir, ele será ignorado no processamento.
* **URL:** `/alunos/import`
* **Método:** `POST`
* **Corpo:** `multipart/form-data`
* **Parâmetro:** `arquivo` (tipo File)

---

## 📊 Estrutura do Arquivo CSV

O arquivo para importação deve conter as seguintes colunas (incluindo cabeçalho):

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
    Ajuste as propriedades de conexão no arquivo `src/main/resources/application.properties`.
3.  **Execução:**
    ```bash
    mvn spring-boot:run
    ```

---

## 🔒 Segurança

A API está protegida com **Basic Auth**. Para realizar requisições via Postman ou cURL, certifique-se de configurar o usuário e senha definidos no seu `application.properties` ou gerados pelo Spring Security no log de inicialização.

---

Desenvolvido com ☕ por [Seu Nome]
