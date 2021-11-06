import Account.Account;
import Account.checkingAccount;
import Account.savingAccount;
import Account.SilverCheckingAccount;
import Account.GoldCheckingAccount;
import Account.DiamondCheckingAccount;
public class Main {

    public static void main(String[] args) {
        SilverCheckingAccount silver=new SilverCheckingAccount(500,0.025,1000);
        GoldCheckingAccount gold=new GoldCheckingAccount(500,0.025,1000);
        DiamondCheckingAccount diamond=new DiamondCheckingAccount(500,0.025,1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(50);
        gold.purchase(50);
        diamond.purchase(50);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());



        /*checkingAccount ca=new checkingAccount(100,0.037,500);
        savingAccount sa=new savingAccount(100,0.045);
        ca.status();
        sa.status();
        ca.withdraw(10);
        sa.withdraw(10);
        ca.status();
        sa.status();*/

       /* checkingAccount Account=new checkingAccount(100,0.042,700);

        System.out.println(Account.getRewardPoints());
        if(Account.purchase(18.63)){
            System.out.println("purchase successful");
        }
        else{
            System.out.println("purchase failed");
        }
        System.out.println(Account.getRewardPoints());*/

        /*Account.status();
        Account.deposit(20);
        Account.status();*/

       /* Account account = new Account(100,0.025);
        account.status();
        account.withdraw(45.86);
        account.status();
        account.withdraw(62.96);
        account.status();
        account.deposit(32.50);
        account.status();*/
    }
}
