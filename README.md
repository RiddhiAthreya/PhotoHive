# PhotoHive

PhotoHive is a Spring Boot application that allows users to manage their photo collections efficiently. Users can upload, list, download, and delete photos seamlessly. This project provides a simple and scalable solution for photo management.

## Features

- **Upload Photos**: Easily upload photos to the application.
- **List Photos**: View a list of all uploaded photos.
- **Download Photos**: Download photos directly to your device.
- **Delete Photos**: Remove photos from the collection.
- 
## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the application.
- **Maven**: Dependency and build management.
- **H2 Database**: Embedded database for development and testing.
- **Spring JDBC**: Simplified database access API.
- **RESTful API Design**: Clean and consistent API endpoints.
-

## Architecture

PhotoHive follows a layered architecture to promote separation of concerns and scalability:

1. **Controller Layer**: Handles incoming HTTP requests and sends responses.
2. **Service Layer**: Contains business logic for photo operations.
3. **Repository Layer**: Manages data persistence using Spring JDBC.
4. **Database**: H2 in-memory database for development; can be replaced with a relational database in production.

### API Endpoints

The API is designed using REST principles, making it intuitive and easy to integrate with other systems.

#### 1. List Photos
- **Endpoint**: `GET /photos`
- **Description**: Fetches a list of all photos.

#### 1. Get Photo
- **Endpoint**: `GET /photo/{id}`
- **Description**: Fetches a particular photo.
- 
#### 2. Upload Photo
- **Endpoint**: `POST /photos`
- **Description**: Uploads a new photo.
- **Headers**: Content-Type: multipart/form-data
- **Parameters**:`file`: "<path to file>"


#### 3. Download Photo
- **Endpoint**: `GET /photos/{photoId}`
- **Description**: Downloads the photo with the specified ID.

#### 4. Delete Photo
- **Endpoint**: `DELETE /photos/{photoId}`
- **Description**: Deletes the photo with the specified ID.





## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For any inquiries or support, please contact:

- **Your Name**: [your-email@example.com](mailto:your-email@example.com)
- GitHub: [your-username](https://github.com/your-username)

---

Thank you for using PhotoHive! Happy photo managing! 🎉
