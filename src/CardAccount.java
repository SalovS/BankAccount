public class CardAccount extends BankAccount{
    private final double COMMISSION = 1.01;

    public boolean withdrawMoney(double money){
        if(enoughMoney(money * COMMISSION)){
            moneyInTheAccount -= money * COMMISSION;
            return true;
        }
        return false;
    }
}
