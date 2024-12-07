# JFSD_END_SEM_LAB
END SEM LAB EXAM EXECUTION ON REST API JPA PROJECT ON CUSTOMER

Develop a Spring Boot application to PUT request with JPA on a Customer entity class. The Customer class should include properties such as Customer ID, Name, Email, Phone Number, Address, and Date of Birth. 

The operations to be performed:
->Insert records manually in the table
->Update Customer Name and Address

Students are required to:
Create the model, repository, service, and controller, considering the package structure as com.klef.jfsd.exam.

The database name should be -> labexam.
Update ->application.properties accordingly as per the task.

## Test the above operations using the Postman API tool.

## OUTPUTS
  ->http://localhost:2011/customer/add
      {
          "name": "Ravi",
          "email": "ravi@example.com",
          "phoneNumber": "9876543210",
          "address": "123 Main Street, Hyderabad, Telangana",
          "dateOfBirth": "1990-05-15"
      }
  ->http://localhost:2011/customer/update
    {
        "customerId": 1,
        "name": "Sumanth",
        "email": "sumanth@example.com",
        "phoneNumber": "9876543289",
        "address": "123 Main Street, Andhra Pradesh",
        "dateOfBirth": "2004-05-15"
    }

