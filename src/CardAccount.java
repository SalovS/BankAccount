public class CardAccount extends BankAccount{
    private double moneyInTheAccount;
    private final double COMMISSION = 1.01;

    public boolean isWithdrawMoney(double money){
        if(enoughMoney(money * COMMISSION)){
            moneyInTheAccount -= money * COMMISSION;
            return true;
        }
        return false;
    }
}
