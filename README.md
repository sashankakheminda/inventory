# Inventory Microservice

The Inventory Microservice is responsible for managing product information and availability.

### Features

API endpoint to retrieve available product

### Technologies Used

Java,
Spring Boot,
MySQL,
Maven,
JPA,
JUnit,
Mockito

### Getting Started

* Java 8 or higher

* MySQL server

### Configuration

#### 1. Clone the repository:

* git clone https://github.com/sashankakheminda/inventory.git

#### 2. Configure the MySQL database connection:

* Open the `src/main/resources/application.properties` file.

* Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties with your MySQL database credentials.

## Build and Run

1. Build the project using Maven:

* `cd inventory`
* `mvn clean package`

2. Run the application:

* `java -jar target/inventory-0.0.1-SNAPSHOT.jar`

The microservice will start running on `http://localhost:8080`

## API Documentation

### Get Available Products

#### Retrieves a list of available products.

* URL: GET `/inventory-microservice/inventory/products`

## Testing

The project includes unit tests for the service layer. You can run the tests using the following command:

* `mvn test`