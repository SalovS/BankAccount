public class BankAccount {
    protected double moneyInTheAccount;

    public boolean withdrawMoney(double money){
        if(enoughMoney(money)){
            moneyInTheAccount -= money;
            return true;
        }
        return false;
    }

    protected boolean enoughMoney(double money){
        if(moneyInTheAccount >= money) {
            return true;
        }
        return false;
    }

    public boolean depositMoney(double money){
        if(money > Double.MAX_VALUE - moneyInTheAccount){
            return false;
        }
        moneyInTheAccount += money;
        return true;
    }

    public double fundBalance(){
        return moneyInTheAccount;
    }

    public boolean send(BankAccount receiver, double amount){
        double balance = moneyInTheAccount;
        boolean debitingMoney = withdrawMoney(amount);
        boolean sendMoney = false;
        if(debitingMoney){
            sendMoney = receiver.depositMoney(amount);
        }
        if(sendMoney && debitingMoney){
            return true;
        }
        moneyInTheAccount = balance;
        return false;
    }
}
