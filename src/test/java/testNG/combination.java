package testNG;

import org.testng.annotations.Test;

public class combination {

	 @Test
		public void login() {
			  
		}

		 @Test(dependsOnMethods = "login")
		 public void logic() {
			 
		 }
		 
		 @Test(dependsOnMethods = {"login , logic"})
		 public void logout() {
			 
		 }
	
}
