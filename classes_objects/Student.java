public class Student{
	
	// instance variables
	int age;   // age default = 0, int is a datatype
	String name; // name default = null, String is a class
	String gender = "female";
	int id;
	char[] grades;
	
	// Overloaded constructors
	// 1.
	Student(int age, String name, char[] grades){
		this(name);
		this.age = age;
		this.grades = grades;
	}
/*	
	Student(){
		
	}
*/
	//2.
	Student(String name){
		this.name = name;
	}
	
	//3.
	Student(int age, String name){
		this(name);
		this.age = age;
	}
	
	boolean updateProfile(String newName){
		name = newName;
		return true;
	}
	static void print(){
	//	int i = this.id; // cannot use 'this' to access an instance variable. - non-static / instance variable 'this' cannot be referenced from a static method
	//	int i = id; // cannot access any state variables or methods from a static method.
	}
	
	public static void main(String[] args){
		int[] ages = new int[]{27, 28, 29};
		
		Student s1 = new Student(ages[0], "Ama");
		s1.gender = "female";
		
		Student s2 = new Student(ages[1], "Babu");
		s2.gender = "male";
		
		Student s3 = new Student(ages[2], "Vennela", new char[] {'A', 'A'});
		s3.gender ="female";
		
		System.out.println("Name s1: "+s1.name);
		System.out.println("Name s2: "+s2.name);
		System.out.println("Name s3: "+s3.name);
				
		s1.updateProfile("Amma");
		
		System.out.println("Updated Name s1: "+s1.name);	
		
		// Reassigning with an object reference - copy of memory addresses are made when they are reassigned which is similar to the object references being passed to methods
		Student s4 = s1; // The memory address of s4 points to the memory address of s1. s4 and s1 are referencing the same object
		System.out.println("Name s4: "+s4.name);

		s4.updateProfile("mike");
		System.out.println("Name s1: "+s1.name);
		
		s4 = s2;
		System.out.println("Name s4: "+s4.name);
		
		s2 = s1;
		System.out.println("Name s4: "+s4.name);
		System.out.println("Name s2: "+s2.name);
		
		// A new object is created - object corresponding to 'Babu' is still there on the heap and it does not have any references. It is orphaned and it is considered as abandoned, but it is still occupying space in the memory. 
		// Automatic memory managament - Here the garbage collector will reclaim the memory occupied by 'Babu'.  
		s4 = new Student("susan"); // If a non parameterized constructor is initialized in the code in lines 17 - 21, s4.name = null 
		System.out.println("Name s4: "+s4.name); // susan is printed since a new object is created all together
		
		System.out.println("Name s2: "+s2.name);
		System.out.println("Name s1: "+s1.name);
	}
}