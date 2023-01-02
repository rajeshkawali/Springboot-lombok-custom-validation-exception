# Springboot-lombok-custom-validation-exception
This project will show how to use lombok, custom-validation, exception handling

### Lombok
Explained how to use lombok features.

### Custom Annotation
Created custom annotation for field validation.

### Custom Exception Handling
How to handle exception by creating custom exception class, @ExceptionHandler and class level annotation @RestControllerAdvice.

### Model Mapper and BeanUtil
How to convert from entity to dto and vice versa.

### H2 Database
Used In memory H2 Database

### H2 Database console
To access H2 DB console  
> http://localhost:8585/h2-ui


### API's and sample json message
Person Api:
> POST http://localhost:8585/api/savePerson
> GET http://localhost:8585/api/getAllPerson
> GET http://localhost:8585/api/findByPersonId/1


Employee Api:
> POST http://localhost:8585/api/addEmployee
> GET http://localhost:8585/api/getAllEmployee
> GET http://localhost:8585/api/findByEmployeeId/1

Person Message:

```
{
    
    "index": 1001,
    "name": "Mahesh Kawali",
    "isActive": false,
    "registered": "2022-12-23T04:46:15+0000",
    "age": 32,
    "gender": "male",
    "eyeColor": "blue",
    "favoriteFruit": "apple",
    "company": {
        "title": "Chandra",
        "email": "mahesh@chandra.com",
        "phone": "+919495683470",
        "location": {
            "country": "India",
            "address": "15 Borivali Mumbai"
        }
    },
    "tags": [
        "Hotel",
        "Business",
        "Entrepreneur",
        "Dhaba"
    ]
}
```

Employee Message:
```
{
   "firstName":"Mahesh",
   "lastName":"Kawali",
   "doj":"07-04-2020",
   "dept":"Software",
   "email":"mahesh@gmail.com",
   "mobile":"9988776655",
   "gender":"male",
   "age":32,
   "aboutMe":"I am software engineer",
   "nationality":"Indian"
}
```