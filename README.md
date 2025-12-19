# Spring Boot Employee Demo

A simple, lightweight RESTful API built with **Spring Boot** for managing employee records. This project demonstrates basic CRUD operations using an H2 in-memory database.

## 🚀 Features

- **Add Employees**: Quickly seed the database with sample employee data.
- **Retrieve All**: Fetch a list of all stored employees.
- **Find by ID**: specialized lookup for individual employee details.
- **Delete All**: Clear the database for a fresh start.
- **In-Memory Database**: Uses H2 for zero-configuration persistence during development.

## 🛠️ Technology Stack

- **Java**: JDK 24
- **Spring Boot**: 3.5.5
  - Spring Web (REST)
  - Spring Data JPA
  - Spring Boot DevTools
- **Database**: H2 (In-memory)
- **Build Tool**: Maven

## 📋 Prerequisites

Ensure you have the following installed on your system:
- **Java Development Kit (JDK) 24** or compatible version.
- **Maven** (optional, as the wrapper is included).

## ⚡ Getting Started

### 1. Clone the Repository
```bash
git clone <your-repo-url>
cd <project-directory>
```

### 2. Run the Application
You can run the application using the included Maven Wrapper:

**Linux/macOS:**
```bash
./mvnw spring-boot:run
```

**Windows:**
```cmd
mvnw.cmd spring-boot:run
```

Alternatively, if you have Maven installed globally:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## 🔌 API Endpoints

Once the application is running, you can test the endpoints using your browser, [Postman](https://www.postman.com/), or `curl`.

| Method | Endpoint          | Description                          |
| :----- | :---------------- | :----------------------------------- |
| `POST` | `/`               | Adds sample employee data.           |
| `GET`  | `/findall`        | Returns a JSON list of all employees.|
| `GET`  | `/findbyid/{id}`  | Returns details of employee with `{id}`.|
| `DELETE`| `/delete`        | Deletes all employee records.        |

### Example Usage (cURL)

**Add Data:**
```bash
curl -X POST http://localhost:8080/
```

**Get All Employees:**
```bash
curl http://localhost:8080/findall
```

**Get Employee by ID (e.g., ID 1):**
```bash
curl http://localhost:8080/findbyid/1
```

**Delete All Data:**
```bash
curl -X DELETE http://localhost:8080/delete
```

## 🗄️ Database Console

The H2 Database Console is enabled. You can access it at:
- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.
