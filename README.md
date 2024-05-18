*Projeto Spring Boot com H2 e JPA - Sistema de Recomendação*

Este projeto é uma API RESTful desenvolvida com Spring Boot que utiliza o banco de dados H2 na memória e JPA (Java Persistence API) para o mapeamento objeto-relacional. A aplicação permite realizar operações CRUD

Instruções de Execução:

Clone este repositório em sua máquina local. Abra o projeto em sua IDE preferida (recomendamos o uso do Eclipse ou IntelliJ IDEA). Certifique-se de que todas as dependências estejam corretamente configuradas (como Spring Boot e bibliotecas relacionadas). Execute a aplicação Spring Boot. Acesse os endpoints da API utilizando um cliente HTTP, como Postman ou Insomnia.

Se quiser acesse o acesse o console H2:

    - URL: `http://localhost:8080/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - User Name: `sa`
    - Password: ``
Documentação da API:

GET /api/usuarios: Retorna uma lista de todos os usuários cadastrados. GET /api/usuarios/{id}: Retorna os detalhes de um usuário específico com base no ID fornecido. POST /api/usuarios: Cria um novo usuário com base nos dados fornecidos no corpo da requisição. PUT /api/usuarios/{id}: Atualiza as informações de um usuário existente com base no ID fornecido e nos dados fornecidos no corpo da requisição. DELETE /api/usuarios/{id}: Exclui o usuário com o ID fornecido.
