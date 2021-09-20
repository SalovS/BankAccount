import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DepositSettlementAccount extends BankAccount{
    private double moneyInTheAccount;
    private Date dateOfDeposit;
    private final int ADDITIONAL_MONTHS = 1;

    public boolean isDepositMoney(double money) {
        if(money > Double.MAX_VALUE - moneyInTheAccount){
            return false;
        }
        moneyInTheAccount += money;
        dateOfDeposit = new Date();
        return true;
    }

    public boolean isWithdrawMoney(double money){
        if(enoughMoney(money) && isCheckingTheDate()){
            moneyInTheAccount -= money;
            return true;
        }
        return false;
    }

    private boolean isCheckingTheDate(){
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, ADDITIONAL_MONTHS);
        date = calendar.getTime();
        return date.before(dateOfDeposit);
    }
}
