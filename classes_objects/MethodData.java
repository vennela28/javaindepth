/*
	Data passed to a method in Java
	Java is always PASS BY VALUE
	Value of argument is passed to parameter
		1. Primitive argument ~ value is primitive
		2. Object reference argument ~ value is memory address of the object
	
		PASS BY VALUE - PRIMITIVES
	void updateId(int newId){   - #2
		newId = 1001;   - #3
	}
	int id = 1000;  - #1
	updateId(id);  - #4   - id = 1000
	
	2. pass by value - copy of argument value is made as 1000 and is assigned to the new method parameter newId
	3. updateId() updates the newId to 1001. However, it is modifying its own copy of 1000
	4. id variable in the calling environment still has the same value 1000, so id is 1000.
	Once the method parameter gets its value, it has nothing to do with the argument used during method invocation in Step 4.
	In Step 4, method execution has completed and local variable newId is discarded; id will still be there in the memory with original value 1000.
	
	                                        --------------------X------------------------
											
		PASS BY VALUE - OBJECT REFERENCES
	void updateId(Student s1){   - #2
		s1.id = 1001;   - #3
	}
	Student s = new Student();
	s.id = 1000;  - #1
	updateId(s);  - #4    - s = 1001
	
	Object is modified inside the method, then that modification is reflected in the calling environment.
	
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
*/

public class MethodData{
	static void go(int[] array){
		System.out.println("array[0]: "+array[0]);
		System.out.println("array[1]: "+array[1]);
		array[1] = 22;
	}

	public static void main(String... args){
		int[] array = {1, 2};
		go(array);
		System.out.println("array[1] in calling method: "+array[1]);
	}
}