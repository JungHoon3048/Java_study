import java.util.InputMismatchException;
import java.util.Scanner;

//1
public class QuickCoding02 { 
	
	// 2
	Scanner sc = new Scanner(System.in); 
	
	// 3
	static String dividend = "100";
	static String divisor = "10";
	
	static int i = Integer.parseInt(dividend);
	static int j = Integer.parseInt(divisor); 

	// 4
	public void Ehandling() {
		
		// 5
		try {
				// 16
				Error er = new Error();
				
				// 6
				System.out.println("input Dividend : ");
				i = sc.nextInt();
				// 17
				er.MyError();
				
				// 7
				System.out.println("input Divisor : ");
				j = sc.nextInt();
				// 18
				er.MyError();
				
				System.out.println("Dividend / Divisor = "+ i/j);
			// 8	
		} catch(InputMismatchException e) {
				System.out.println("문자를 입력하면 안됩니다");
		  }// 9
		  catch(ArithmeticException e) {
			  	System.out.println("0으로 나누면 안됩니다");
		  }// 19
          catch(MyException e) {
			    e.printStackTrace();
		  }
	} // 10
	public static void main(String[] args) {
		QuickCoding02 qc = new QuickCoding02();
			qc.Ehandling();
	}
}
	

