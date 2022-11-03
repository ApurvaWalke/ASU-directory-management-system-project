# Directory Management System Project 

## Phase 1

UML diagram for given implementation 

<img width="1076" alt="test1234" src="https://user-images.githubusercontent.com/87394060/199637741-6bc7cd9f-9bab-4c10-9177-89aa5123a0ac.png">


## Phase 2 

Object Orient Principal voilations in the code:

1. Object Oriented Concept Violations:
Violation: Data Encapsulation principle is violated for Person.java class. All the attributes are set to be public and can be easily called and used by other classes.
Fix:  The attributes should be accessed using a public getter method. 

![image](https://user-images.githubusercontent.com/87394060/199638126-36ac55c1-7095-42df-847f-3791c9599e78.png)



2. Content Coupling:
Violation: Content Coupling is observed when one module accesses and modifies data from another module. In PersonnelDirectory.java class, the main method makes the totalObjects value zero (which is a private variable) by instantiating an object of the class.
Fix:  This should be done by a setter method instead. 

![image](https://user-images.githubusercontent.com/87394060/199638157-1d1927b9-5786-44ab-a347-ba30348165b7.png)


3. Common Coupling
Violation: Common coupling is when certain data is shared and changed by multiple classes. An example of that is the static int numObjects variable in the totalObjects.java class. It can be changed by any of the classes in the code. 
Fix: This can be fixed by using a Singleton Design pattern. By using singleton class, the same instance of the class will be invoked every time

![image](https://user-images.githubusercontent.com/87394060/199638202-2127e501-29dc-4e26-b689-cccd7810e3e4.png)


4. Control Coupling
Violation:Control coupling is when the flow of execution in one class is determined by a variable of another class. This can be seen in the switch statement in the PersonnelDirectory.java class. Especially in the case 2 where if the person is not found in the directory, create a new Person object. 
Fix: Factory Design pattern implementation can be used to rule out control coupling.

![image](https://user-images.githubusercontent.com/87394060/199638239-84e1ced6-6bf1-43ab-ab5d-8fd2f1987662.png)


5. Stamp Coupling:
Violation: Stamping coupling happens when one class sends a collection or object as a parameter to another class when only a few data members are used. An example of that is the PersonnelDirectory class passing object employee to the Personnel class. The employee class data like employeeID and salary are not required by the personnel class

Fix: Pass only the parameters necessary (Eg. e1.lastN, e1.firstN, e1.middleN)

![image](https://user-images.githubusercontent.com/87394060/199638399-33b9f657-3d6f-4392-8409-713fb665c328.png)




