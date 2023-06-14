package calculator;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		    Scanner input= new Scanner(System.in);
		    Main main = new Main();
		    OperationForCalc o = new  OperationForCalc();
		    System.out.println("Enter a");
		    int a = input.nextInt();
		    System.out.println("Enter b");
		    int b = input.nextInt();
		    System.out.println("Enter method");
		    String method = input.next();
		    System.out.println(a+" "+b+" "+method);
		   
			if (method == "addition" ) {
		    	o.add(a,b);
		    	
		    }
		    else if (method == "subtraction") {
		    	o.sub(a,b);
		    }
		    else if (method == "multiplication") {
		    	o.mul(a,b);
		    }
		    else if (method == "division") {
		    	o.div(a,b);
		    }
		    
	 }
}
