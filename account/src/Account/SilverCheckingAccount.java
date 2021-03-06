package Account;

public class SilverCheckingAccount extends checkingAccount{
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(cost*25);
    }
}
