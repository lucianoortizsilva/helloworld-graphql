# Helloworld utilizando Graphql

# Tech Stack!

  - Spring Boot 
  - H2
  - Graph QL
  - Swagger
  - Maven

## Para rodar o projeto faça:


 - 1º. Build com maven

 - 2º. Execute a classe HelloworldGraphqlApplication.java

 - 3º. Insira dados fake, existem 2 opções: via swagger ou via script SQL
 
 - 3.1. Via swagger: [http://localhost:8080/swagger-ui.html]

 - 3.2. Via script SQL: [http://localhost:8080/h2-console] \
 ![h2-config](https://user-images.githubusercontent.com/18357844/44362362-34f09880-a497-11e8-88a8-7139b8a687bf.png) 

 - 3.2.1 Sugestão de insert: src/main/resources/static/sql/data.sql

 - 4º. Aplicar GraphQL: http://localhost:8080/
 ![graphql](https://user-images.githubusercontent.com/18357844/44362571-c6f8a100-a497-11e8-9722-cbe4599d9dc5.jpg)
