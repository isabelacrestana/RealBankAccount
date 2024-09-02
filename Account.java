public class Account
{
    private long numAccount;
    private String accountHolder;
    private double balance;
    private double limit;
    private String password;
    private static long nextNumber;
    private Date openingDate;

    public Account()
    {
        this.accountHolder = "Unknown";
        this.limit = 0.0;
        this.openingDate = new Date(2000,1,1);
    }

    public Account (String accountHolder, double limit, Date openingDateIn)
    {
        this.accountHolder = accountHolder;
        this.numAccount = ++nextNumber;
        this.limit = limit;

        this.balance = 0.0;
        this.password = "0000";

        this.openingDate = new Date(openingDateIn.getYear(), openingDateIn.getMonth(), openingDateIn.getDate());
    }

    public long getNumAccount()
    {
        return numAccount;
    }

    public void setNumAccount(long numAccount)
    {
        this.numAccount = numAccount;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getLimit()
    {
        return limit;
    }

    public void setLimit(double limit)
    {
        this.limit = limit;
    }

    public void withdraw(double value)
    {
        if (value > 0)
        {            
            if (value <= balance || value <= limit)
            {
                this.balance -= value;
                System.out.println("Success!");
            }

            else
            {
                System.out.println("Fail!");
            }
        }
    }

    public void deposit(double value)
    {
        if (value > 0)
        {
            this.balance += value;
            System.out.println("Success!\n");
        }

        else
        {
            System.out.println("Fail!\n");
        }
    }

    public void changePassword(String oldPassword, String newPassword)
    {
        if(oldPassword.equals(this.password))
        {
            this.password = newPassword;
            System.out.println("Senha alterada com sucesso!");
        }

        else 
        {
            System.out.println("Senha incorreta. Senha não pode ser alterada!");
        }
    }

    public void printAccount()
    {
        System.out.printf("\nAccount %04d:"+
                          "\nAccount Holder: %s"+
                          "\nAccount Balance: $%.2f"+
                          "\nAccount Limit: $%.2f\n"+
                          "\n%s", 
                          getNumAccount(), getAccountHolder(),
                          getBalance(), getLimit(), openingDate);
    }
}