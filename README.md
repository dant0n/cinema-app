# Cinema application
A RESTful web app simulating a simple cinema service,
where user can buy tickets for a movie session with a specific movie, cinema hall and air time. 
User can add multiple tickets to their shopping cart and finalize the order when ready. 
Using Spring Security for the authentication and authorization of the user.
Here are some actions depending on the user's role (anonymous, admin, user):

### Anonymous:

- registration
- view available movie sessions
- view movies
- view cinema halls

### With User role:

- form the ticket with a specific movie, cinema hall and air time.
- add tickets to the shopping cart
- view all their tickets in the shopping cart
- complete the order
- view a history of all their orders

### With Admin role:

- find users by their email
- create and add movies to the DB
- create and add cinema halls to the DB 
- CRUD operations with the movie sessions.

## Technologies used

- Frameworks: Spring - Core / MVC / Web / Security
- ORM: Hibernate
- DB: MySQL
- Packaging - Apache Maven
- WebServer: Tomcat

## Configuration:

- Clone this project.
- Edit mock data in the "db.properties" file to yours.
- Configure Tomcat.
- Run a project.
- You can test the API with the existing ADMIN ("bob@mail.com", password:"1234")
  and USER (name: "alice@mail.com", password:"1234") roles.
