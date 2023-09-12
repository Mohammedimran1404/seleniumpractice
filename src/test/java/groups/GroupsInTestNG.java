package groups;
import org.testng.annotations.Test;

public class GroupsInTestNG {
	@Test(groups="smoke")
	public void tc1() {
		System.out.println("tc1 logic");
	}
	
	@Test(groups= {"smoke", "sanity"})
	public void tc2() {
		System.out.println("tc2 logic");
	}
	@Test(groups={"smoke","sanity","regression"})
	public void tc3() {
		System.out.println("tc3 logic");
	}
	@Test(groups={"regression"})
	public void tc4() {
		System.out.println("tc4 logic");
	}
	@Test(groups={"sanity"})
	public void tc5() {
		System.out.println("tc5 logic");
	}

}
