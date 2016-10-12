
import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyTestClass {

	Calculator cal = new Calculator();
	
	public static final Logger LOG= Logger.getLogger(Calculator.class.getName());
	
	Random rand = new Random();
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	int[] arr = new int[]{10,100,1000,10,100,1000};
	double value1=0.0;
	double value2=0.0;
	int p = 0;
	
	/*@Test
	public void testAdd() {
		
				
		for(int i = 0; i<5; i++){
				
			if(i>2){
			
			 value1 = rand.nextInt(arr[i])*(-1);
			 value2 = rand.nextInt(arr[i])*(-1);
			 p=arr[i]*(-1);
			}
			else{
		 value1 = rand.nextInt(arr[i]);
		 value2 = rand.nextInt(arr[i]);
		 p=arr[i];
			}
		double result= value1+value2;
		double result2=cal.add(value1, value2);
		//p=arr[i];
		
		
		//double d = Double.parseDouble(df.format(value1+value2));
		
		//double t = Double.parseDouble(df.format(cal.add(value1, value2)));
		//df.format(result);
		LOG.info("Testing the method add within range "+p+" with the values: "+ value1+ " and "+value2);
		assertEquals(result2,result,0.0);
			
		}
				
	}
	*/
		@Test
		public void testAddNumbers(){
			
			double firstNumber = 0;
			double secondNumber = 0;
			double result = 0;
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method add with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.add(firstNumber, secondNumber)), Math.round(result));
			}
			
		}

		@Test
		public void testSubtractNumbers(){
			
			double firstNumber = 0;
			double secondNumber = 0;
			double result = 0;
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				result = firstNumber - secondNumber;
				
				LOG.info("Testing the method subtract with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.subtract(firstNumber, secondNumber)), Math.round(result));
			}
			
		}
		
		public void testMultiplyNumbers(){
			
			double firstNumber = 0;
			double secondNumber = 0;
			double result = 0;
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*10-10));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*100-100));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
			for(int i=0; i<=10;i++){
				firstNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				secondNumber = Double.valueOf(df.format(rand.nextDouble()*1000-1000));
				result = firstNumber * secondNumber;
				
				LOG.info("Testing the method multiply with "+firstNumber+" and "+secondNumber);
				assertEquals(Math.round(cal.multiply(firstNumber, secondNumber)), Math.round(result));
			}
			
		}
}
