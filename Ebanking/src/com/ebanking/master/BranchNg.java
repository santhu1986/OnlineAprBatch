package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNg extends Base
{
    @Test
	public void Br() throws InterruptedException
	{
		LB.BranchCre("Ammerpetbranch","Miyapur","54655","INDIA","Delhi","Delhi");
	}
}
