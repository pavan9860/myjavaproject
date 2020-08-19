package javajunit;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import junit.extensions.*;
import org.junit.Test;
import junit.runner.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;




public class firstp {
	
	MathProvider provider; 
	
	 provider = new MathProvider();
	 
	 
	 @Test
	 public void multiply()
	 {
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     int firstNumber = 10;
	     int secondNumber = 20;
	 assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
	 System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 }
	
	 
	
	 

}
