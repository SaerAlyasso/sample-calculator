
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
	
	@Test
	public void testAdd() {
		
				
		for(int i = 0; i<6; i++){
				
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
	
	

}
