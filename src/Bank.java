

public class Bank extends Account{

       public static void main(String[] args)
    {

        Account account = new Account();
        account.setName("Aishwarya");
        account.setAccNo(1234753543);
        account.setAccBalance(35000);
        account.setEmail("a.aish1997@gmail.com");
        System.out.println("the account details are");
        System.out.println("bank name :"+account.bankName);
        System.out.println("Account name : "+account.getName());
        System.out.println("Account number : "+account.getAccNo());
        System.out.println("Account email : "+account.getEmail());
        System.out.println("Account balance : "+account.getAccBalance());
        account.deposit();

    }
}





