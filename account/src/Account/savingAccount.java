package Account;

public class savingAccount extends Account{
    public savingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
        public boolean withdraw(double amount){
            double fee = 0.025 * amount;
            amount += fee;
           /* if (amount > balance) {
                return false;
            }
            balance -= amount;
            return true;*/
            return super.withdraw(amount);

        }
    }

