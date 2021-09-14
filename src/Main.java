public class Main {
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount();
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.println(userAccount.depositMoney(500));
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.println(userAccount.withdrawMoney(105));
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.println("------------------------------------------");

        DepositSettlementAccount depositUserAccount = new DepositSettlementAccount();
        System.out.printf("%.2f\n",depositUserAccount.fundBalance());
        System.out.println(depositUserAccount.depositMoney(500));
        System.out.printf("%.2f\n",depositUserAccount.fundBalance());
        System.out.println(depositUserAccount.withdrawMoney(105));
        System.out.printf("%.2f\n",depositUserAccount.fundBalance());
        System.out.println("------------------------------------------");

        CardAccount cardUserAccount = new CardAccount();
        System.out.printf("%.2f\n",cardUserAccount.fundBalance());
        System.out.println(cardUserAccount.depositMoney(500));
        System.out.printf("%.2f\n",cardUserAccount.fundBalance());
        System.out.println(cardUserAccount.withdrawMoney(105));
        System.out.printf("%.2f\n",cardUserAccount.fundBalance());
        System.out.println("------------------------------------------");

        BankAccount user2Account = new BankAccount();
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.printf("%.2f\n",user2Account.fundBalance());
        System.out.println(userAccount.send(user2Account,200));
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.printf("%.2f\n",user2Account.fundBalance());
        System.out.println(userAccount.send(user2Account,500));
        System.out.printf("%.2f\n",userAccount.fundBalance());
        System.out.printf("%.2f\n",user2Account.fundBalance());

    }
}
