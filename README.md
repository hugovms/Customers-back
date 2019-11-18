# Customers APP
## Back-end

O módulo back-end dessa aplicação utiliza [Spring Boot](https://spring.io/projects/spring-boot/) e [Spring Data Rest](https://projects.spring.io/spring-data-rest/) para gerar uma API Rest que persiste os dados em um banco de dados.

O código da aplicação é feito em [Java](https://www.java.com/pt_BR/).

Para que a aplicação funcione corretamente é necessário criar uma tabela com o nome de `suritte`, configurar o application.properties de acordo com o seu MYSQL e popular a tabela phoneTypes para que os tipos de telefone sejam exibidos corretamente no Front-End.

Quando iniciada com sucesso a aplicação estará disponível na porta `8000`.

Como uma API Rest tradicional, as seguintes opções estão disponíveis:

| Método | URL                                     | Descrição                                 |
|--------|-----------------------------------------|-------------------------------------------|
| GET    | http://localhost:8000/api/customers     | Lista os clientes cadastrados             |
| GET    | http://localhost:8000/api/customer/{id} | Retorna os dados de um cliente            |
| GET    | http://localhost:8000/api/phone-types   | Retorna os tipos de telefone cadastrados  |
| POST   | http://localhost:8000/api/customer      | Permite cadastrar um novo cliente         |
| PUT    | http://localhost:8000/api/customer/{id} | Atualiza os dados completos de um cliente |
| DELETE | http://localhost:8000/api/customer/{id} | Apaga um cliente cadastrado               |
