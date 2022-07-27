package example;

import java.util.*;    
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AppMain {
	public static void main(String args[])
	{
		final Logger logger =LoggerFactory.getLogger(Calculator.class);
		 Scanner sc = new Scanner(System.in);
		            logger.info("First number: ");
		            int x = sc.nextInt();;
		            logger.info("Second number: ");
		            int y = sc.nextInt();
		            logger.info("Operator: ");
		            char operator = sc.next().charAt(0);
		            
		            switch(operator){
		       	 
		            case '+':
		            	logger.info("Addition of {} and {} is:{} ",x,y,Calculator.add(x,y));
		            	break;
		            case '-':
		            	logger.info("Subtraction of {} and {} is:{} ",x,y,Calculator.sub(x,y));
		            	  break;
		            case '*':
		            	logger.info("Multiplication of {} and {} is:{} ",x,y,Calculator.multiply(x,y));
		            	  break;
		            case '/':
		            	logger.info("Division of {} and {} is:{} ",x,y,Calculator.divide(x,y));
		            	  break;
		            default:
		            	logger.info("Enter valid Operation");  
		            } 
		  
			
	}
}
