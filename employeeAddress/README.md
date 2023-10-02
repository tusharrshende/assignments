# Employee Address Management System

## Frameworks and Language Used

- **Framework:** Spring Boot
- **Language:** Java
- **Database:** MySQL (Assumed)

## Data Flow

### Controller

1. **EmployeeController:**
   - Responsible for handling HTTP requests related to employees.
   - Endpoints:
     - `POST /employee` for creating a new employee.
     - `GET /employee` for retrieving all employees.
     - `GET /employee/id/{id}` for retrieving an employee by ID.
     - `DELETE /employee/id/{id}` for deleting an employee by ID.
     - `PUT /employee/id/{id}` for updating an employee by ID.

2. **AddressController:**
   - Handles HTTP requests related to addresses.
   - Endpoints:
     - `POST /address` for creating a new address.
     - `GET /address` for retrieving all addresses.
     - `GET /address/id/{id}` for retrieving an address by ID.
     - `DELETE /address/id/{id}` for deleting an address by ID.
     - `PUT /address/id/{id}` for updating an address by ID.

### Services

1. **EmployeeService:**
   - Provides business logic for employee operations.
   - Methods:
     - `addNewEmployee(Employee newEmployee)` for creating a new employee.
     - `getAllEmployee()` for retrieving all employees.
     - `getEmployeeById(Long id)` for retrieving an employee by ID.
     - `deleteEmployeeById(Long id)` for deleting an employee by ID.
     - `updateEmployeeById(Long id, Employee newEmployee)` for updating an employee by ID.

2. **AddressService:**
   - Contains business logic for address operations.
   - Methods:
     - `addNewAddress(Address newAddress)` for creating a new address.
     - `getAllAddress()` for retrieving all addresses.
     - `getAddressById(Long id)` for retrieving an address by ID.
     - `deleteById(Long id)` for deleting an address by ID.
     - `updateAddressById(Long id, Address newAddress)` for updating an address by ID.

### Repository

1. **IEmployeeRepo:**
   - Extends `JpaRepository<Employee, Long>`.
   - Allows CRUD operations on `Employee` entities.

2. **IAddressRepo:**
   - Extends `JpaRepository<Address, Long>`.
   - Allows CRUD operations on `Address` entities.

## Database Design

- **Employee Entity:**
  - `id` (Primary Key)
  - `firstName`
  - `lastName`
  - `address` (One-to-One relationship with Address)

- **Address Entity:**
  - `id` (Primary Key)
  - `street`
  - `state`
  - `zipCode`

## Data Structure Used

- The project uses Java objects to represent employees and addresses.
- Spring Boot handles the mapping of these objects to database tables.

## Project Summary

This Spring Boot-based Employee Address Management System allows you to perform CRUD operations on employee and address records. It uses a MySQL database for data storage and provides a RESTful API with dedicated controllers for employees and addresses. The services layer handles the business logic, and data access is managed using Spring Data JPA repositories. The project utilizes one-to-one relationships between employees and addresses to maintain a clean and organized data structure.
