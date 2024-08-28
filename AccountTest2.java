import java.util.Scanner;

public class AccountTest2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int option;

        Account conta3 = new Account();
        Account conta2 = new Account("Isabela", 1000);
        Account conta1 = new Account("Mauricio", 5);

        conta1.printAccount();
        conta2.printAccount();
        conta3.printAccount();   

        do {
            System.out.printf("\n\n" + 
                              "<<<<<<<<<<<<<<>>>>>>>>>>>>>" +
                              "\nMENU:\n" + 
                              " 1. Print account data\n" + 
                              " 2. Update password\n" + 
                              " 3. Withdraw\n" + 
                              " 4. Make a deposit\n" +
                              " 0. Exit\n");

            option = input.nextInt();

            switch (option)
            {
                case 1:
                {
                    conta1.printAccount();
                    break;
                }

                case 2:
                {
                    input.nextLine();

                    System.out.println("Old password: ");
                    String oldPassword = input.nextLine();

                    System.out.println("New password: ");
                    String newPassword = input.nextLine();

                    conta1.changePassword(oldPassword, newPassword);  

                    break;            
                }

                case 3:
                {
                    System.out.println("Withdraw value: ");
                    double withdrawValue = input.nextDouble();
                    conta1.withdraw(withdrawValue);
                    break;
                }

                case 4:
                {
                    System.out.println("Deposit value: ");
                    double depositValue = input.nextDouble();
                    conta1.deposit(depositValue);
                    break;
                }

                case 0:
                {
                    System.out.println("Exiting...");
                    break;
                }

                default:
                {
                    System.out.println("Invalid option...\n");
                }
            }
        } while(option != 0);    

        System.out.println();
        input.close();
    }
}