package Com;

public class Customer {
public static void main(String[] args) {
	Bank b = new BankImp1();
	b.checkBalance();
	System.out.println("----------------");
	
	
	b.deposit(3000);
	b.checkBalance();
	System.out.println("-------");
	b.withdraw(5000);
	b.checkBalance();                       
}
}
