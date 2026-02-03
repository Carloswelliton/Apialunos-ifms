``` text
```
br.edu.ifms
│
├── domain
│   ├── model
│   │   └── AlunoModel.java
│   │
│   ├── repository
│   │   └── AlunoRepository.java
│   │
│   ├── security
│   │   └── UsuarioAutenticadoService.java
│   │
│   └── exception
│       ├── PermissaoNegadaException.java
│       └── AlunoNaoEncontradoException.java
│
├── application
│   └── usecase
│       ├── ListarAlunosUseCase.java
│       ├── BuscarAlunoUseCase.java
│       ├── BuscarAlunoPorMatriculaUseCase.java
│       └── ImportarAlunosCsvUseCase.java
│
├── infrastructure
│   ├── persistence
│   │   ├── entity
│   │   │   └── AlunoEntity.java
│   │   │
│   │   ├── repository
│   │   │   └── AlunoRepositoryJpa.java
│   │   │
│   │   └── mapper
│   │       └── AlunoMapper.java
│   │
│   ├── security
│   │   ├── JwtFilter.java
│   │   ├── JwtService.java
│   │   └── UsuarioAutenticadoServiceImpl.java
│   │
│   └── service
│       ├── CsvAlunoParserService.java
│       └── PasswordHashService.java
│
├── interfaces
│   ├── controller
│   │   └── AlunoController.java
│   │
│   ├── dto
│   │   ├── AlunoRequest.java
│   │   └── AlunoResponse.java
│   │
│   └── exception
│       └── GlobalExceptionHandler.java
│
└── config
    ├── SecurityConfig.java
    └── OpenApiConfig.java
```
```
