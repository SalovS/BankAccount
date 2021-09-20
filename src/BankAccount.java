public class BankAccount {
    private double balance;

    public boolean isWithdrawMoney(double money){
        if(enoughMoney(money)){
            balance -= money;
            return true;
        }
        return false;
    }

    protected boolean enoughMoney(double money){
        if(balance >= money) {
            return true;
        }
        return false;
    }

    public boolean isDepositMoney(double money){
        if(money > Double.MAX_VALUE - balance){
            return false;
        }
        balance += money;
        return true;
    }

    public double fundBalance(){
        return balance;
    }

    public boolean isSend(BankAccount receiver, double amount){
        double money = balance;
        boolean debitingMoney = isWithdrawMoney(amount);
        boolean sendMoney = false;
        if(debitingMoney){
            sendMoney = receiver.isDepositMoney(amount);
        }
        if(sendMoney && debitingMoney){
            return true;
        }
        balance = money;
        return false;
    }
}
