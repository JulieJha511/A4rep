package Sample.java;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority=1,invocationCount=5)
	
	public void ctratUser() {
		System.err.println("user created!!");
	}
		@Test(priority=2,dependsOnMethods= {"create User"})
		public void modifyUser() {
			System.out.println("user modify");
		}
		@Test(priority=3)
		public void deleteUser() {
			System.out.println("user deleted");
		}
	
	
}
