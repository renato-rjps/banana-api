# banana-api

Banana REST API

### Arquitetura

- REST com HATEOAS

### Tecnologias

- Java 8
- SpringBoot 2
- H2 - Database

### Como acessar a base de dados?

Este projeto está utilizando uma base de dados em memória. Para acessar basta subir a aplicação e acessar o endereço :<http://localhost:8080/banana-api/h2-console/>

Dados de acesso:

* usuário: sa
* password:
* url: jdbc:h2:mem:banana

### Como rodar o projeto?

* git clone https://github.com/renato-rjps/banana-api.git​ 

* mvnw clean install

* mvnw spring-boot:run

  