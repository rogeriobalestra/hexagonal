com.br.hexagonal
│
├── application
│   └── service
│       └── ClienteService.java
│
├── domain
│   └── cliente
│       └── port
│           └── ClienteRepositoryPort.java
│
├── infrastructure
│   └── adapter
│       └── mysql
│           └── MySQLClienteAdapter.java
│
├── external
│   └── MySQLCliente.java   // classe que você NÃO pode alterar
│
└── SolidApiApplication.java


Rdomain → só regras de negócio
📌 Regra de ouro

domain → só regras de negócio

application → orquestra casos de uso

infrastructure → tecnologia, banco, APIs

external → código legado / terceiros
