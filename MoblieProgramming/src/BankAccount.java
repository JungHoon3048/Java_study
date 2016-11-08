
public class BankAccount {
	
	int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void plus(int money) {
		balance += money;
		System.out.println("총 잔액 합계(방금 입금된 금액 포함) : "+balance+""+"방금 입금된 금액  : "+money);
	}
	
	public void minus(int money) {
		balance -= money;
		System.out.println("총 잔액 합계(방금 출금된 금액 포함) : "+balance+""+"방금 출금된 금액  : "+money);
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}

}
