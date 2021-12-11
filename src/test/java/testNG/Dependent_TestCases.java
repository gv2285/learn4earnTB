package testNG;

     import org.testng.annotations.Test;

     public class Dependent_TestCases {
	 
			/*
			 * @Test public void login() {
			 * 
			 * }
			 * 
			 * @Test(dependsOnMethods = "login") public void logic() {
			 * 
			 * }
			 * 
			 * @Test(dependsOnMethods = {"login" , "logic"}) public void logout() {
			 * 
			 * }
			 */
    	 //Enablement_Disablement
    	 @Test public void login() {
			  
			  }
			  
			  @Test(dependsOnMethods = "login") public void logic() {
			  
			  }
			  
			  @Test(dependsOnMethods = {"login" , "logic"}) public void logout() {
			  
			  }
    	 
}
