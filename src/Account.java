import java.util.Scanner;

public class Account {

    private String accName;
    private long accNo;
    private String accType;
    private float accBalance;
    private String email;
    public String bankName;
   Account(){
       bankName="vijaya";
   }
    Scanner get = new Scanner(System.in);


    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long acc_no) {
        this.accNo = acc_no;
    }

    public String getName() {
        return accName;
    }

    public void setName(String name) {
        this.accName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(float amount) {
        this.accBalance = amount;
    }

    void deposit() {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        accBalance = accBalance + amount;
        System.out.println("Deposited! Account Balance is " + accBalance);
    }
}

