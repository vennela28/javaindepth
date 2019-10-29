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
		
		Student s1 = new Student(ages[0], "Amma");
		s1.gender = "female";
		
		Student s2 = new Student(ages[1], "Babu");
		s2.gender = "male";
		
		Student s3 = new Student(ages[2], "Venela", new char[] {'A', 'A'});
		s3.gender ="female";
		
		System.out.println("Name s1: "+s1.name);
		System.out.println("Name s2: "+s2.name);
		System.out.println("Name s3: "+s3.name);
				
		s3.updateProfile("Vennela");
		
		System.out.println("Name s3 corrected: "+s3.name);		
	}
}