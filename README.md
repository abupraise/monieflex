
# MonieFlex

MonieFlex is a fintech application that streamlines financial transactions and management. This repository contains the backend code written in Java and the CI/CD pipeline setup using GitHub Actions.

## Features

- User authentication and authorization
- Secure financial transactions
- Integration with Docker for containerization
- Continuous Integration and Deployment with GitHub Actions

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker
- GitHub account

### Setup

1. **Clone the repository**:
   ```sh
   git clone https://github.com/abupraise/monieflex.git
   cd monieflex
   ```

2. **Build the application**:
   ```sh
   mvn clean package -DskipTests
   ```

3. **Run the application**:
   ```sh
   docker-compose up --build
   ```

### Continuous Integration and Deployment

The project is set up with GitHub Actions for Continuous Integration and Deployment. On every push to the `main` branch, the following actions are performed:

1. Checkout the code.
2. Set up JDK 17.
3. Cache Maven dependencies.
4. Build the application using Maven.
5. Login to DockerHub.
6. Build and push the Docker image.
7. Run the Docker container.

### Triggering the Pipeline

Any push to the `main` branch or any pull request to `main` will trigger the CI/CD pipeline.

## Contributing

Contributions are welcome! Please create a pull request with your changes.

## License

This project is licensed under the MIT License.
