package classandobjects;

public class Initialaize_objects {
      String color;
      int age;
      
	public static void main(String[] args) {
		Initialaize_objects rambo = new Initialaize_objects();
		rambo.color = "black";
		rambo.age = 1;
		System.out.println(rambo.color);
		System.out.println(rambo.age);
		rambo.initObject("black", 1);
	   rambo.display();
	   

	}
    public void initObject(String c, int a) {
    	color = c;
    	age = a;
    }
    public void display() {
    	System.out.println(color + " " + age);
    	
    }
}
