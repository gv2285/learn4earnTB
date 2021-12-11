package classandobjects;

public class Animals {

	public static void main(String[] args) {
		Animals rambo = new Animals();
		rambo.barking();
		rambo.eating();
		
		Mobiles iphone = new Mobiles();
		iphone.itunes();
		iphone.appstore();
				
	    Laptops dell = new Laptops();
	    dell.quality();
	    dell.ram();
	    

	}
    public void barking() {
    System.out.println("Rambo barks");	
    }
    
    public void eating() {
    	System.out.println("Rambo eats");
    }
}

class Mobiles{
	void itunes() {
		System.out.println("Iphone has itunes");
	}
		
	void appstore() {
		System.out.println("Iphone has appstore");
		
	}
}
	
class Laptops{
	void quality() {
		System.out.println("Dell has good quality");
	}
	void ram() {
		System.out.println("Dell has 8GB-RAM");
	}
}
     