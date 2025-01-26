# DSList
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RafaelVnc/dslist/blob/main/LICENSE) 
## About the project
DSList is a BackEnd project elaborated and created during the "Intensivão Java Spring" by [devsuperior](https://devsuperior.com.br).

## Objectives
- Create a REST API
- Implement the Layer pattern (As shown in the diagram below)
- Implement the Domain model (As shown in the diagram below)
- Database seeding
## Covered Concepts:
- Controller, services, repositories 
- DTO pattern
- HTTP
- Client-Server Model
- ORM (Object Relational Mapper)
- Good practices
- CORS
- CI/CD

## Domain Model 
![Domain Model DSList](https://github.com/RafaelVnc/assets/blob/main/DSList/eng/dslist-model.png)

## Layer Pattern Diagram
![Layer Pattern Diagram DSList](https://github.com/RafaelVnc/assets/blob/main/DSList/eng/LayerDiagram.png)

## Endpoints and Answers
[Postman Collection](https://github.com/RafaelVnc/dslist/blob/main/DSList.postman_collection.json)
### - **GET** Games: `{{host}}/games`
Returns all games in the database. 

Answer:

![Answer GET /games](https://github.com/RafaelVnc/assets/blob/main/DSList/JsonAnswers/GETGames.png)
    
### - **GET** Game Lists: `{{host}}/lists`
Returns all lists in the database.

Answer:

![Answer GET /lists](https://github.com/RafaelVnc/assets/blob/main/DSList/JsonAnswers/GETLists.png)

### - **GET** Games By List: `{{host}}/lists/{listId}/games`
Returns the games from the list according to the passed ListId.

Answer (listId = 2):

![Answer GET /lists/2/games](https://github.com/RafaelVnc/assets/blob/main/DSList/JsonAnswers/GETGamesByList(Id%3D2).png)

### - **POST** List Replacement: `{{host}}/lists/{listId}/replacement`
Moves games by position within a list, sourceIndex and destinationIndex must be passed in the request body.

Example of use: Dragging functionality to move a game to a desired position on the screen that displays the games from a list.

Body example:

![POST List Replacement Body sourceIndex = 3, destinationIndex = 1](https://github.com/RafaelVnc/assets/blob/main/DSList/JsonAnswers/POSTListReplacementBody.png)

Expected answer:
### `200 OK`

## Technologies
- Java 21
- Java Spring Framework
- Maven
- JPA
- H2 Database
- PostgresSQL
- Docker

## Project profiles
### Test
Environment for running automated and manual tests to ensure code quality and functionality without affecting development or production.

- H2 database

### Dev
Environment used by developers for building, debugging, and testing new features or updates in an isolated, flexible setup.
- Docker container for postgres database

### Prod
Live environment where the finalized and stable application runs, accessible to end users for real-world usage.
- Ready to deploy application to heroku, railway, AWS, etc.

## How to run
```bash
# clone repository
git clone https://github.com/RafaelVnc/dslist.git

# check if bash is already in the project folder
# execute project
./mvnw spring-boot:run
```

## Author
Rafael Oliveira Venancio

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rafael-oliveira-venancio-6904122a6/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/RafaelVnc)