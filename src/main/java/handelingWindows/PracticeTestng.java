package handelingWindows;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTestng {

	@Test(groups = {"common"})
	@Parameters({"text","subject"})
	public void tc1(String text, String subject) {
		System.out.println("Method 1");
		System.out.print(text+" ");System.out.println(subject);
		
		
	}
@Test (dependsOnGroups = {"sanity"})
public void tc2() {
	System.out.println("Method 2");
}
@Test(groups = {"regression"})
public void tc3() {
	System.out.println("Method 3");
	//Assert.assertTrue(false);
}
@Test(groups= {"sanity"})
public void tc4() {
		System.out.println("Method 4");
}
@Test(dataProvider="getdata")
public void para(String name ,String password) {
	System.out.println(name +"   "+password);
	
}

@DataProvider
public Object[][] getdata() {
	Object[][] data = new Object[2][2];
	data[0][0] ="User name 1";
	data[0][1]="Password 1";
	data[1][0]="User NAme 2";
	data[1][1]="Password 2";
	return data;
	
}
}

