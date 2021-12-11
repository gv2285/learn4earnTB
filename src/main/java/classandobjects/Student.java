package classandobjects;

public class Student {
	String name;
	int age;

	public static void main(String[] args) {
		Student st1 = new Student("Rohit", 101);
        Student st2 = new Student("Rose", 120);
        Student st3 = new Student("King", 20);
        
        System.out.println(st1.name + " " +st1.age );
        System.out.println(st2.name + " " +st2.age);
        System.out.println(st3.name + " " +st3.age);
        
		
		
	

	}
	
	public Student(String name, int age) {
     this.name = name;
     this.age = age;
     
}
}