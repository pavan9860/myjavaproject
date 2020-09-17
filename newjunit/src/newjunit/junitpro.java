package newjunit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class junitpro {
	
	@Test
	public void jcase()
	{
		int a = 4;
		int b = 5;
		
		int c = Math.addExact(a, b);
        int d = 9;		
		assertEquals(d,c,"Test done");
		
		
	}
	
	


}
