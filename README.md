# Sistema de Fidelidade

Projeto simples de sistema de fidelidade para clientes, desenvolvido em Java com Spring Boot.  
Este projeto foi criado para demonstrar conhecimentos básicos em backend, utilizando arquitetura MVC, REST API e documentação automática com Swagger/OpenAPI.

---

## Tecnologias utilizadas

- Java 23  
- Spring Boot 3  
- Spring Data JPA  
- H2 Database (banco em memória para testes)  
- Maven (gerenciador de dependências)  
- Springdoc OpenAPI (Swagger UI para documentação)  
- Git e GitHub para versionamento  

---

## Como rodar o projeto

1. Clone o repositório:  
   ```bash
   git clone https://github.com/SuckerMiguel12/sistemafidelidade.git

---

2.Entre na pasta do projeto:
   
   ```bash
   cd sistemafidelidade/sistemafidelidade ```

---

3.Execute o projeto com Maven:
   
   ```bash
   mvn spring-boot:run ```

---

4.Acesse no navegador:
   
   API REST: http://localhost:8080/clientes
   
   Documentação Swagger: http://localhost:8080/swagger-ui.html

---

Funcionalidades

• CRUD completo de clientes:

• Listar clientes

• Adicionar novo cliente

• Atualizar cliente existente

• Deletar cliente

• Controle básico de pontos de fidelidade dos clientes

---

Estrutura do projeto

• model — contém as entidades (ex: Cliente)

• repository — interfaces para acesso ao banco de dados

• controller — endpoints REST para manipulação das entidades

---


Melhorias futuras

• Integração com banco de dados real (MySQL, PostgreSQL)

• Autenticação e autorização (Spring Security)

• Interface frontend (React, Angular ou outra)

• Funcionalidades para reservas e promoções

---

Autor

• Miguel Augusto Nunes Fanhani

---

Contato

• GitHub: https://github.com/SuckerMiguel12

• Email: miguel.seuemail@exemplo.com

Muito obrigado pela oportunidade de mostrar este projeto!
