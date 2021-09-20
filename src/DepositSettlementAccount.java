import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DepositSettlementAccount extends BankAccount{
    private Date dateOfDeposit;
    private final int ADDITIONAL_MONTHS = 1;

    protected boolean isDoesNotExceedMax(double money) {
        if(money > Double.MAX_VALUE - balance){
            return false;
        }
        return true;
    }

    public void toUpBalance(double money){
        if (isDoesNotExceedMax(money)) {
            balance += money;
            dateOfDeposit = new Date();
        }
    }

    protected boolean isWithdrawMoney(double money){
        if(isEnoughMoney(money) && isCheckingTheDate()){
            return true;
        }
        return false;
    }

    public void withdrawMoney(double money){
        if(isWithdrawMoney(money)){
            balance -= money;
        }
    }

    protected boolean isCheckingTheDate(){ //////
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, ADDITIONAL_MONTHS);
        date = calendar.getTime();
        return date.before(dateOfDeposit);
    }
}
