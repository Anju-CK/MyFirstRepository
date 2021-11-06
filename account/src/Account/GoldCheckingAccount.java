package Account;

public class GoldCheckingAccount extends checkingAccount{
    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(Math.min(cost,4000)*50);

    }
}
