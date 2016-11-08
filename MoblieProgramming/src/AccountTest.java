
public class AccountTest {

	public static BankAccount account = new BankAccount();
	
	public static void main (String []args) {
	
		Thread depositMan = new Thread() {
			
			public void execute() {
				
				for(int i=0; i<100; i++) {
					account.plus(10);
				}
			
			}
		};
	
		Thread withdrawMan = new Thread() {
			
			public void execute() {
				
				for(int i=0; i<100; i++) {
					account.minus(10);
				}
			
			}
		};
		
		depositMan.start();
		
		withdrawMan.start();
		
	}

}
