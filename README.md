# Usuarios API

## 📌 Sobre o Projeto
Este projeto de aprendizado é uma API REST para gerenciamento de usuários, construída com **Spring Boot** e **Spring Data JPA**. Permite operações básicas de CRUD (Create, Read, Update, Delete) sobre usuários armazenados em um banco de dados em memória.

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **H2 Database**
- **Postman**
- **Maven**

## 📌 Endpoints Disponíveis

### 🔹 Criar um usuário
```http
POST /usuarios
```
**Corpo da requisição (JSON):**
```json
{
  "nomeUsuario": "João Silva",
  "email": "joao@email.com"
}
```

### 🔹 Buscar usuário por ID
```http
GET /usuarios/{id}
```

### 🔹 Atualizar um usuário
```http
PUT /usuarios/{id}
```
**Corpo da requisição (JSON):**
```json
{
  "nomeUsuario": "João Souza",
  "email": "joaosouza@email.com"
}
```

### 🔹 Excluir um usuário
```http
DELETE /usuarios/{id}
```

### 🔹 Buscar usuários por nome
```http
GET /usuarios?nomeUsuario=João
```

## 📄 Estrutura do Projeto
```
usuarios-api/
│── src/main/java/com/github/vmariath/usuariosapi/
│   ├── controller/        # Controladores REST
│   │   └── UsuarioController.java
│   ├── model/             # Modelos de entidade
│   │   └── Usuario.java
│   ├── repository/        # Repositórios JPA
│   │   └── UsuarioRepository.java
│── src/main/resources/
│   ├── application.properties  # Configurações do Spring Boot
│── pom.xml  # Dependências do Maven
│── README.md  # Documentação do projeto
```

## 📌 Controle de Versões

- **30/01/2025 - Versão 1.0**  
  - Estrutura inicial da API com operações CRUD.
  - Configuração do banco de dados PostgreSQL.
  - Implementação do `UsuarioController`, `UsuarioRepository` e `Usuario`.
  - Configuração básica do Spring Boot e JPA.

---
Criado por [Vinicius Mariath](https://github.com/vmariath) 🚀






