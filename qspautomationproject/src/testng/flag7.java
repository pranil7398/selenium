package testng;

public class flag7 {
	@Test(groups="FUNCTIONAL")
	public void ft1()
	{
		Reporter.Log("ft1"true);
	}
		
		@Test(groups="")
		public void ft1()
		{
			Reporter.Log("ft1"true);
		}
	
	

}
king is alwys king