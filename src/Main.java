import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        SavingsAccount savingsAccount1 = new SavingsAccount(1000,0.05);
        SavingsAccount savingsAccount2 = new SavingsAccount(1000,0.05);
        SavingsAccount savingsAccount3 = new SavingsAccount(1000,0.05);
        CheckingAccount checkingAccount1 = new CheckingAccount(1000,1);
        CheckingAccount checkingAccount2 = new CheckingAccount(1000,1);
        CheckingAccount checkingAccount3 = new CheckingAccount(1000,1);
        accountList.add(savingsAccount1);
        accountList.add(savingsAccount2);
        accountList.add(savingsAccount3);
        accountList.add(checkingAccount1);
        accountList.add(checkingAccount2);
        accountList.add(checkingAccount3);

        for (Account a : accountList){
            System.out.println(a.calculateInterest());
        }



    }
}