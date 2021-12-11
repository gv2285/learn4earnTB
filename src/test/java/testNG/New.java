package testNG;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class New {
	public class testNG {
		
	    @BeforeSuite
	     public void beforesuite() {
	     System.out.println("This is the before suit method which will be execute first");
	    }
	    
	    @AfterSuite
	    public void aftersuite() {
	    	System.out.println("This is the after suite method will be execute second");
	    
	    }
	    @BeforeTest
	    public void beforetest() {
	    	System.out.println("This is the before test method");
	    
	    }
	    
	    @AfterTest
	    public void aftertest() {
	    	System.out.println("This is the after test method");
	    }
	    
	    @BeforeMethod
	    public void beforemethode() {
	    	System.out.println("This is the before method");
	    }
	   
	   @Test
	   public void testcase() {
		   System.out.println("This is the test case");
		   
	   }
	    
	   @AfterMethod
	   public void aftermethod() {
		   System.out.println("This is the after method");
	   }

	   @BeforeClass
	   public void beforeclass() {
		   System.out.println("This is the before class method");
		  
	   }

	   @AfterClass
	   public void afterclass() {
		System.out.println("This is the after class method");   
	   }
	   
	}


}
