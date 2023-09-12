package runningTestCasesParallel;

import org.testng.annotations.Test;

public class RunningTestCasesParalleBasic {
	
//	@Test(priority=1, timeOut = 1000)
//	public void test1() throws InterruptedException {
//		Thread.sleep(4000);
//		System.out.println("test 1 is running :"+Thread.currentThread().getId());
//	}
//
//	@Test(priority=2,dependsOnMethods = "test1", alwaysRun = true)
//	public void test2() {
//		System.out.println("test 2 is running :"+Thread.currentThread().getId());
//	}
//
//	@Test(priority=3)
//	public void test3() {
//		System.out.println("test 3 is running :"+Thread.currentThread().getId());
// }
	@Test(priority=1)
	public void test1(){
		
		System.out.println("test 1 is running :"+Thread.currentThread().getId());
	}

	@Test(priority=2,threadPoolSize = 3,invocationCount = 3)
	public void test2() {
		System.out.println("test 2 is running :"+Thread.currentThread().getId());
	}

	@Test(priority=3)
	public void test3() {
		System.out.println("test 3 is running :"+Thread.currentThread().getId());
 }
}
