public class CardAccount extends BankAccount{
    private final double COMMISSION = 1.01;

    protected boolean isWithdrawMoney(double money){
        if(isEnoughMoney(money * COMMISSION)){
            return true;
        }
        return false;
    }

    public void withdrawMoney(double money){
        if(isWithdrawMoney(money)){
            balance -= money * COMMISSION;
        }
    }
}
