# 📚 Book API – Spring Boot RESTful Web Service

A Spring Boot application that exposes a RESTful API to manage a collection of books.  
This project is ideal for beginners to intermediate developers looking to understand **Spring Boot**, **REST APIs**, **JPA**, and **testing with JUnit/MockMvc**.

---

## 🚀 Features

- ✅ **Create** a new book
- 📖 **Retrieve** all books or a book by ID
- 🔍 **Search** books by author or title
- ✏️ **Update** an existing book
- ❌ **Delete** a book
- 📥 **Download** book data as a CSV file
- 🧪 **Unit testing** using JUnit 5 and MockMvc
- ⚡ In-memory **H2 database** for quick testing

---

## 🧱 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Web (REST)**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **JUnit 5 & Mockito**
- **MockMvc**
- **Maven**

---

## 📁 Project Structure

bookapi/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/bookapi/
│ │ │ ├── controller/ → REST Controllers
│ │ │ ├── model/ → JPA Entities
│ │ │ ├── repository/ → Spring Data JPA Repositories
│ │ │ ├── service/ → Business Logic Layer
│ │ │ └── BookapiApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static/, templates/ (if needed)
│ └── test/
│ └── java/com/example/bookapi/controller/
│ └── BookControllerTest.java
│
├── .gitignore
├── README.md
└── pom.xml



---

## ⚙️ Running the Application

### 📦 With Maven
```
bash
mvn spring-boot:run
Or package and run:

mvn clean install
java -jar target/bookapi-0.0.1-SNAPSHOT.jar
```

💻 Access the API

The app runs at:

http://localhost:8080

| Method | Endpoint                       | Description               |
| ------ | ------------------------------ | ------------------------- |
| GET    | `/api/books`                   | Get all books             |
| GET    | `/api/books/{id}`              | Get book by ID            |
| POST   | `/api/books`                   | Add new book              |
| PUT    | `/api/books/{id}`              | Update book by ID         |
| DELETE | `/api/books/{id}`              | Delete book by ID         |
| GET    | `/api/books/search?author=xyz` | Search by author          |
| GET    | `/api/books/download`          | Download book list as CSV |

🧪 Running Tests

mvn test

Test class example:

    BookControllerTest using @WebMvcTest, MockMvc, and Mockito.

🛠️ H2 Console (In-Memory DB)

Access the in-memory database UI here:

http://localhost:8080/h2-console

Use this JDBC URL:

jdbc:h2:mem:testdb

📌 Future Improvements (Ideas to Try)

    Add pagination & sorting

    Add Swagger/OpenAPI docs

    Connect to MySQL/PostgreSQL

    Add authentication with Spring Security

    Containerize with Docker

    Deploy to Heroku, Railway, or Render

📄 License

This project is open source and free to use.
🙋‍♂️ Author

Developed by [Your Name]
Feel free to contribute or open issues.


---

Let me know if you'd like to:
- Add badges (build status, code coverage, etc.)
- Include screenshots or Postman collection
- Convert it into a full GitHub Pages documentation

Happy coding! 💻


ChatGPT can make mistakes. Check important info. See
