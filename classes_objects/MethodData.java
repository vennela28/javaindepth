/*
	Data passed to a method in Java
	Java is always PASS BY VALUE
	Value of argument is passed to parameter
		1. Primitive argument ~ value is primitive
		2. Object reference argument ~ value is memory address of the object
	
		PASS BY VALUE - PRIMITIVES
	void updateId(int newId){   - #2  newId = 1000 = id
		newId = 1001;   - #3    newId = 1001   - Once the method parameter 'newId' gets its value, it has nothing to do with the argument 'id' used in method invocation.
	}
	int id = 1000;  - #1  - id = 1000 
	updateId(id);  - #4   - id = 1000 - The method invocation has completed and the local variable 'newId' is discarded 
	                                    While 'id' will still be there in the memory with the original value 1000.
	
	2. pass by value - copy of argument value is made as 1000 and is assigned to the new method parameter newId
	3. updateId() updates the newId to 1001. However, it is modifying its own value of 1000 assigned in step 2.
	4. 'id' variable in the calling environment still has the same value 1000, so 'id' is 1000.
	Once the method parameter 'newId' gets its value, it has nothing to do with the argument 'id' used during method invocation in Step 4.
	In Step 4, method execution has completed and local variable 'newId' is discarded, while 'id' will still be there in the memory with original value 1000.
	
	                                        --------------------X------------------------
											
		PASS BY VALUE - OBJECT REFERENCES
	void updateId(Student s1){   - #2  - method updateId() has already been invoked so copy of argument value is made and is assigned to a method parameter s1.
	                                     The argument value is the memory address 85411 and so it is assigned to s1. 
										 Both 's' and 's1' are referencing the same student object. 
		s1.id = 1001;   - #3    - updateId() updates the id field of the object to 1001.
								  This also affects the object reference s in the caller's environment as student object is referenced by both s and s1. 
								  So accessing 'id' field using object reference s in the calling environment would also return the value 1001
	}
	Student s = new Student();
	s.id = 1000;  - #1  - student object is created and its variable 'id' is initialized to 1000. 
	                      In memory, there is a student object with id as 1000 at the memory address 85411 and a variable s is referencing it.
	updateId(s);  - #4  - s = 1001  - The method execution has completed and the local variable s1 is discarded 
	                                  while the object reference s will still be there with updated value 1001.
	
	Object is modified inside the method, then that modification is reflected in the calling environment which does not happen in primitive arguments.
	
											--------------------X------------------------
	
		PASS BY VALUE - REASSIGNMENT
	void updateId(Student s1){   - #2
		s1 = new Student();
		s1.id = 1001;   - #3
	}
	Student s = new Student();
	s.id = 1000;  - #1
	updateId(s);  - #4    - s = 1000
	
	Both method parameter and the argument in the calling environment are independent. 
	So any change made on the new object via the method parameter will not have any affect on the original object referenced by the argument in the method invocation statement.	
	                                        --------------------X------------------------
							
	PRIMITIVES in memory
	int id = 1000; 
	variable id has 3 components logical name, memory address, value - logical name is the name used in the source code to refer to its data. 
	Compiler converts logical name to memory address. During program execution, memory address matters and data is stored in the memory address. 
	At runtime, we have only memory address and value. No variable names at runtime.
	
	                                        --------------------X------------------------
	
	OBJECT REFERENCES in memory
		Student s = new Student();
		Student object is created which is referenced by an object reference s. 
		s is not an object, but simply holds bits that reference a student object in memory. 
		s holds the memory of student object. 
		81921 stores the memory address of the actual object which is 85411. So the memory address of the actual object is 85411 and 81921 is holding the value for variable s.  
	
	
*/

/*
	PASSING DATA to a method is identical to a variable assignment. 
			method parameter = method argument
	Primitive : int id = 1000;
	            int newId = id;
				newId = 1001;
				so finally, id = 1000;

	Object Reference : Student s = new Student();
					   s.id = 1000;
					   Student s1 = s;
					   s1.id = 1001;
					   so finally, s.id = 1001;
*/

public class MethodData{
	static void go(int[] array){  // memory address gets passed to go(). So array object in the method and in the calling environment reference.
		System.out.println("array[0]: "+array[0]);
		System.out.println("array[1]: "+array[1]);
		array[1] = 22;   // updating array[1] to 22 so it should also be reflected in the calling environment too.
	}

	public static void main(String... args){
		int[] array = {1, 2};   // creating an array object. array - object reference
		go(array);   // calling environment
		System.out.println("array[1] in calling method: "+array[1]);
		go(array);
	}
}