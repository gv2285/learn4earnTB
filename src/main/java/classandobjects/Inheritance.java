package classandobjects;

public class Inheritance {

	public static void main(String[] args) {
    Child child = new Child();
    child.money();
    child.house();
    
	}
	
	public void money() {
		System.out.println("Parent's money");
	}
    public void house() {
    	System.out.println("Parent's house");
    }
}
   class Child extends Inheritance {
	   
   }
