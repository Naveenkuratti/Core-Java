package Com;

public class BankImp1 implements Bank{
int balance=5000;
@Override
public void deposit(int amount) {
	System.out.println("desposting rs:"+amount);
	balance =balance+amount;
	System.out.println("amount desposited susscessfully");
	
	
}

@Override
public void withdraw(int amount) {
	System.out.println("withdrawing rs:"+amount);
	balance -=amount;
	System.out.println("amount withdrawn susscessfully");
	

}
@Override
public void checkBalance() {
	System.out.println("avalable balance:rs"+balance);
}
	
}

