## Book Tracker API

**A Spring Boot API for tracking books** — this application allows users to organize their reading lists, track books read, create wishlists, and categorize books for easy reference.

### Table of Contents

1. [Features](#features)
2. [Installation](#installation)
3. [Usage](#usage)
4. [API Endpoints](#api-endpoints)
5. [Technologies Used](#technologies-used)
6. [Contributing](#contributing)
7. [License](#license)

---

### Features

- Organize books by reading status (e.g., Read, Wishlist).
- Categorize books with tags or categories.
- Track details such as author, publication date, and personal notes.
- Simple authentication using Basic Authentication (can be extended to OAuth in the future).

### Installation

To set up and run this project locally:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/book-tracker-api.git
   cd book-tracker-api
   ```

2. **Install dependencies and build the project:**

   Ensure you have Java and Maven installed.

   ```bash
   mvn clean install
   ```

3. **Configure database settings:**

   In `application.properties`, configure your PostgreSQL database settings:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/book_tracker
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

5. **Access the API:**

   The API should now be running at `http://localhost:8080`.

### Usage

- **Basic Authentication**: When accessing the API, use your credentials (username and password).
- **Database Setup**: Use PostgreSQL for persistent storage, configured in `application.properties`.

### API Endpoints

Here's a summary of the API routes. For full details, refer to the Swagger documentation (link if applicable) or the source code.

| Method | Endpoint                 | Description                     |
|--------|---------------------------|---------------------------------|
| GET    | `/api/books`             | List all books                  |
| POST   | `/api/books`             | Add a new book                  |
| GET    | `/api/books/{id}`        | Get details of a specific book  |
| PUT    | `/api/books/{id}`        | Update a book's details         |
| DELETE | `/api/books/{id}`        | Delete a book                   |

### Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Heroku** (for deployment)

### Contributing

Contributions are welcome! Please open an issue to discuss your ideas, or submit a pull request if you have a bug fix or enhancement.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

### License

This project is licensed under the MIT License. See `LICENSE` for more details.

---