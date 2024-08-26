import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Account 1: ");
        System.out.println("Account holder: ");
        String name1 = input.nextLine();

        System.out.println("Account balance: ");
        double balance1 = input.nextDouble();
        input.nextLine();

        Account account1 = new Account(name1, balance1);

        System.out.println("\nAccount 2: ");
        System.out.println("Account holder: ");
        String name2 = input.nextLine();

        System.out.println("Account balance: ");
        double balance2 = input.nextDouble();
        input.nextLine();

        Account account2 = new Account(name2, balance2);

        System.out.println("\nAccount 3: ");
        System.out.println("Account holder: ");
        String name3 = input.nextLine();

        System.out.println("Account balance: ");
        double balance3 = input.nextDouble();
        input.nextLine();

        Account account3 = new Account(name3, balance3);

        account1.printAccount();
        account2.printAccount();
        account3.printAccount();
        
        input.close();
    }
}