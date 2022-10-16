package com.av.NextDate;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class NextDateTest  {
	NextDate date=null;
	@Before
	public void setup()
	{
		 date=new NextDate();
	}
  
  @Test
  public void test()
  {
	  
	  assertEquals("next Date is:3/2/2001",date.dateShower1(2, 2, 2001));
	  assertEquals("invalid month",date.dateShower1(2, 0, 2001));
	  assertEquals("invalid date",date.dateShower1(0, 2, 2001));
	  assertEquals("invalid year",date.dateShower1(2, 2, 2023));
	  assertEquals("next Date is:29/2/2004",date.dateShower1(28, 2, 2004));
	  assertEquals("next Date is:1/5/2004",date.dateShower1(30, 4, 2004));
	  assertEquals("next Date is:1/1/2005",date.dateShower1(31, 12, 2004));
	  
	  
	  
	  
  }
  @After
  public void release()
  {
	  System.out.print("Test Completed");
  }

}
