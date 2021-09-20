public class BankAccount {
    protected double balance;
    public void withdrawMoney(double money){
        if(isEnoughMoney(money)){
            balance -= money;
        }
    }

    protected boolean isEnoughMoney(double money){
        if(balance >= money) {
            return true;
        }
        return false;
    }

    protected boolean isDoesNotExceedMax(double money){
        if(money > Double.MAX_VALUE - balance){
            return false;
        }
        return true;
    }

    public void toUpBalance(double money){
        if(isDoesNotExceedMax(money)){
            balance += money;
        }
    }

    public double fundBalance(){
        return balance;
    }

    protected boolean isSend(BankAccount receiver, double amount){
        boolean debitingMoney = isEnoughMoney(amount);
        boolean sendMoney = false;
        if(debitingMoney){
            sendMoney = receiver.isDoesNotExceedMax(amount);
        }
        if(sendMoney && debitingMoney){
            return true;
        }
        return false;
    }

    public void sendMoney(BankAccount receiver, double amount){
        if(isSend(receiver, amount)){
            withdrawMoney(amount);
            receiver.toUpBalance(amount);
        }
    }
}
