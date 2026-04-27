# demo-dao-jdbc

![Java](https://img.shields.io/badge/Java-25+-ED8B00?style=flat&logo=openjdk&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow?style=flat)

Projeto desenvolvido durante o módulo de acesso a banco de dados do curso [Java COMPLETO 2026](https://github.com/Deduv/curso_udemy-java_completo), instrutor Nelio Alves (DevSuperior).

---

## Sobre o projeto

Implementação do padrão **Data Access Object (DAO)** utilizando JDBC puro para persistência em banco de dados relacional MySQL. O projeto demonstra como isolar a camada de acesso a dados da lógica de negócio através de interfaces e do padrão Factory.

---

## Estrutura do projeto

```
src/
├── application/          # Classes de teste e execução
├── db/                   # Gerenciamento de conexão e exceções de banco
├── entities/             # Entidades: Department, Seller
└── model/
    ├── dao/              # Interfaces DepartmentDao e SellerDao
    ├── dao/impl/         # Implementações: DepartmentDaoJDBC, SellerDaoJDBC
    └── DaoFactory.java   # Factory para instanciar os DAOs
```

---

## Padrões e conceitos aplicados

| Conceito | Aplicação |
|---|---|
| Padrão DAO | Abstração da camada de persistência via interfaces |
| Padrão Factory | `DaoFactory` centraliza a criação dos DAOs |
| JDBC | Conexão, `PreparedStatement`, `ResultSet` |
| Encapsulamento | Entidades com getters/setters e construtores |
| Tratamento de exceções | `DbException` customizada para erros de banco |

---

## Operações implementadas

### SellerDao
- `findById(int id)`
- `findByDepartment(Department department)`
- `findAll()`
- `insert(Seller obj)`
- `update(Seller obj)`
- `deleteById(int id)`

### DepartmentDao
- `findById(int id)`
- `findAll()`
- `insert(Department obj)`
- `update(Department obj)`
- `deleteById(int id)`

---

## Tecnologias

| Categoria | Tecnologia |
|---|---|
| Linguagem | Java 25+ |
| Banco de dados | MySQL |
| Acesso a dados | JDBC |
| IDE | Spring Tool Suite (STS) |
| Sistema Operacional | Linux Mint |

---

## Como executar

1. Clone o repositório
```bash
git clone https://github.com/Deduv/demo-dao-jdbc.git
```

2. Configure as credenciais do banco no arquivo `db.properties` na raiz do projeto:
```properties
user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

3. Execute o script SQL para criar o banco e as tabelas (disponível na pasta `resources/` ou nas aulas do curso)

4. Rode as classes em `application/` diretamente pela IDE

---

*Desenvolvido por [Deduv](https://github.com/Deduv) · Graduando em Engenharia de Software*
