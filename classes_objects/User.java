/*
					CONSTRUCTOR
Constructors - construct objects and initializing the object state
Constructor has code that runs when you create an object.
Initialize object state - instance variables of the object

Constructor should have the same name as the class name. 
It can have parameters. 
It should not have a return type. 
It can have a varargs parameter.

If a constructor is not provided, the compiler automatically inserts one default constructor with no parameters - no-args constructor
If atleast one constructor is provided, the compiler does not insert a no-args default constructor.

class Student{
	int id;
	Student(int newId){
		this.id = newId;
	}
}
	Student s = new Student(1001); - we can invoke a constructor like this
	Student s = new Student(); // illegal - but we cannot invoke a no-args constructor - compiler error. Add a no-args constructor manually to use it. Compiler will not insert one automatically.
	
	
CONSTRUCTOR OVERLOADING
> Same overloading rules as methods.
> can create objects using any of the overloaded constructors.

Why Constructor Overloading?
To create objects with different capabilities

FileOutputStream class has overloaded constructors

Constructor cannot invoke itself. - cannot have a recursive invocation statement
*/

public class User{
	int id;
	String name;
	double salary;
	
	User(int newId, String newName){
	// this(newId, newName); - compiler error - RECURSIVE CONSTRUCTOR
	// this(newId, newName, 0); - compiler error - RECURSIVE CONSTRUCTOR
		id = newId;
		name = newName;
	return; // Constructors do not have a return type in the declaration, they cannot return any value. However, they can have a return statement without any expression. - unreachable code
	}
	
	String testName;
	
	User(int newId, String newName, double newSalary){
	// this(newId, newName, newSalary); - compiler error - RECURSIVE CONSTRUCTOR - constructor cannot invoke itself
	// this(newId, newName); - compiler error - RECURSIVE CONSTRUCTOR - invoke the first constructor and first constructor invoking the second constructor
		this(newId, newName); // this invocation statement MUST be the first statement, otherwise COMPILATION ERROR 
							  // use keyword 'this' followed by any arguments needed by the overloaded constructor
							  // ONLY ONE invocation statement per constructor
	//this(newId, testName);  - cannot pass instance variables as arguments - instance variables are not yet initialized - lead to compilation errors
	//                        - cannot reference 'testName' before supertype constructor has been called.
							  // NO RECURSIVE invocation is allowed - infinite loop
							  // allows us to remove duplicate code in the constructors
	// this(newId, newName); //In a constructor we cannot have more than one invocation statement - COMPILATION ERROR
		salary = newSalary;
	}
	
	public static void main(String... args){
		User abc = new User(100000, "John");  // invoke the first constructor
		User user = new User(100001, "Vennela", 5000000);  // invoke the second constructor
		
		System.out.println("User Salary: "+user.salary);
	}
}
