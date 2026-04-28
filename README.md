# demo-dao-jdbc — CRUD com padrão DAO

![Java](https://img.shields.io/badge/Java-25+-ED8B00?style=flat&logo=openjdk&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![CRUD](https://img.shields.io/badge/CRUD-completo-4CAF50?style=flat)
![Status](https://img.shields.io/badge/Status-Concluído-4CAF50?style=flat)

Projeto desenvolvido durante o módulo de acesso a banco de dados do curso [Java Completo — Udemy](https://github.com/Deduv/curso_udemy-java_completo), instrutor Nelio Alves (DevSuperior).

---

## Sobre o projeto

Implementação de um CRUD completo utilizando o padrão **Data Access Object (DAO)** com JDBC puro e MySQL. O projeto isola a camada de acesso a dados da lógica de negócio através de interfaces e do padrão Factory, com tratamento de exceções customizadas e reutilização de objetos via `HashMap`.

---

## Estrutura do projeto

```
management-system-dao/
├── src/
│   ├── application/
│   │   ├── Program.java               # Testes das operações de Seller
│   │   └── Program2.java              # Testes das operações de Department
│   ├── db/
│   │   ├── DB.java                    # Gerenciamento de conexão via db.properties
│   │   ├── DbException.java           # Exceção customizada para erros de banco
│   │   └── DbIntegrityException.java  # Exceção para violações de integridade
│   └── model/
│       ├── dao/
│       │   ├── DaoFactory.java        # Factory para instanciar os DAOs
│       │   ├── SellerDao.java         # Interface com contrato do SellerDao
│       │   └── DepartmentDao.java     # Interface com contrato do DepartmentDao
│       ├── dao/impl/
│       │   ├── SellerDaoJDBC.java     # Implementação JDBC do SellerDao
│       │   └── DepartmentDaoJDBC.java # Implementação JDBC do DepartmentDao
│       └── entities/
│           ├── Seller.java            # Entidade com id, name, email, birthDate, baseSalary, department
│           └── Department.java        # Entidade com id e name
└── db.properties                      # Configuração da conexão com o banco
```

---

## Padrões e conceitos aplicados

| Conceito | Aplicação |
|---|---|
| Padrão DAO | Camada de persistência abstraída via interfaces `SellerDao` e `DepartmentDao` |
| Padrão Factory | `DaoFactory` centraliza a criação dos DAOs, desacoplando a implementação |
| JDBC | `PreparedStatement`, `ResultSet`, `Statement.RETURN_GENERATED_KEYS` |
| Reutilização de objetos | `HashMap<Integer, Department>` em `findAll` e `findByDepartment` evita instâncias duplicadas |
| Exceções customizadas | `DbException` para erros gerais e `DbIntegrityException` para violações de integridade |
| Encapsulamento | Entidades com getters/setters, `equals`, `hashCode` e `toString` |

---

## Operações implementadas

### SellerDao

| Método | Descrição |
|---|---|
| `findById(Integer id)` | Busca seller por id com JOIN em department |
| `findByDepartment(Department department)` | Lista sellers filtrados por departamento |
| `findAll()` | Lista todos os sellers ordenados por nome |
| `insert(Seller obj)` | Insere seller e atribui o id gerado ao objeto |
| `update(Seller obj)` | Atualiza todos os campos do seller |
| `deleteById(Integer id)` | Remove seller por id, lança exceção se não existir |

### DepartmentDao

| Método | Descrição |
|---|---|
| `findById(Integer id)` | Busca department por id |
| `findAll()` | Lista todos os departments ordenados por nome |
| `insert(Department obj)` | Insere department e atribui o id gerado ao objeto |
| `update(Department obj)` | Atualiza o nome do department |
| `deleteById(Integer id)` | Remove department por id |

---

## Tecnologias

| Categoria | Tecnologia |
|---|---|
| Linguagem | Java 25+ |
| Banco de dados | MySQL |
| Acesso a dados | JDBC |
| IDE | IntelliJ IDEA |
| Sistema Operacional | Linux Mint |

---

*Desenvolvido por [Deduv](https://github.com/Deduv) · Graduando em Engenharia de Software*
