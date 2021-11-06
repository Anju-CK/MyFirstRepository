package Account;

public class DiamondCheckingAccount extends checkingAccount {
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        int reward=0;
        if(cost>500){
            reward+=(cost-500)*80;
            cost=500;
        }
        if(cost>100){
            reward+=(cost-100)*65;
            cost=100;
        }
        reward+=cost*40;
        return reward;
    }
}

