
## Overview
This is a building temperature control system where users can manage the temperature of various rooms in a building. 
The system allows the user to set the desired building temperature and add rooms dynamically (both apartments and common rooms). The system adjusts the temperature of the rooms accordingly.

## Assumptions
- Added the condition for the building for the supported temperature range is 10-40 degrees for whole and the types of rooms.
- Added the condition to continue with the functionalities of building temperature control system or wants to exit it.
  
## Features
- Set the requested building temperature.
- Add new rooms (either apartments or common rooms).
- Automatically adjust room temperatures based on the building temperature.
- Simulate building temperature control with periodic temperature adjustments.
 
## Prerequisites
Before running this application, ensure you have the following installed:

**Java 8 or later** (for running the Java application)
**Maven** (for building the project)
**Junit** (for testing the project)


## Example of user interatcion

Room ID: 101, Current Room Temperature: 37.103214021359804 degrees, Heating Switch: OFF, Cooling Switch: ON
Room ID: 102, Current Room Temperature: 30.560331246523702 degrees, Heating Switch: OFF, Cooling Switch: ON
Room ID: 1, Current Room Temperature: 11.10519687756827 degrees, Heating Switch: ON, Cooling Switch: OFF
Room ID: 2, Current Room Temperature: 18.276594031548928 degrees, Heating Switch: ON, Cooling Switch: OFF

kindly give the requested Building Temperature: 20

Want to add a new room? 
Press Y for add N for discard: Y
Enter Room ID: 105
Wants to add an Apartment or Common Room? 
Press A for Apartment and C for Common Room  A
Kinldy Enter Owner Name: Gaurav
Updated room list....
Room ID: 101, Current Temperature: 37.103214021359804 degrees
Room ID: 102, Current Temperature: 30.560331246523702 degrees
Room ID: 1, Current Temperature: 11.10519687756827 degrees
Room ID: 2, Current Temperature: 18.276594031548928 degrees
Room ID: 105, Current Temperature: 13.566621576310926 degrees

Do you want to continue with adding more rooms to building? (Y to continue, N to exit): N

Do you want to continue with the Budilding Temperature Control System? (Y to continue, N to exit): Y
Room ID: 101, Current Room Temperature: 36.103214021359804 degrees, Heating Switch: OFF, Cooling Switch: ON
Room ID: 102, Current Room Temperature: 29.560331246523702 degrees, Heating Switch: OFF, Cooling Switch: ON
Room ID: 1, Current Room Temperature: 12.10519687756827 degrees, Heating Switch: ON, Cooling Switch: OFF
Room ID: 2, Current Room Temperature: 18.276594031548928 degrees, Heating Switch: OFF, Cooling Switch: OFF
Room ID: 105, Current Room Temperature: 14.566621576310926 degrees, Heating Switch: ON, Cooling Switch: OFF

kindly give the requested Building Temperature:

## Steps to Run Locally
1. Clone the repository:
    ```bash
    git clone <https://github.com/jforjha/building-temperature-control>
    ```
2. Navigate to the project directory:
    ```bash
    cd <project-directory>
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn exec:java

## Testing
A test class has been added to ensure the correct functionality of the `Building` and `Apartment` classes. The tests include:
- Validating the building temperature within the acceptable range.
- Testing the functionality of adding rooms to the building.
- Simulating building temperature adjustments and ensuring rooms are adjusted accordingly.

### Test Class
The test class `BuildingTest` is located under `src/test/java/com/model/`. It uses `JUnit` for unit testing the core functionalities of the application. Here are some of the key tests:
- **Test for setting the requested building temperature**.
- **Test for rejecting invalid temperature values** (outside the range of 10–40 degrees).
- **Test for adding rooms to the building**.
- **Test for simulating building temperature**.
- **Test for adjusting room temperatures**.

To run the tests:
```bash
mvn test
    

 
