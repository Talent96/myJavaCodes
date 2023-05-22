import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter your name");

        String name = input.nextLine();

        account.setName(name);

        account.setAccountNumber();


        account.deposit(20000);
        System.out.printf("your balance is %.2f%n", account.getBalance());

        account.withdraw(5000);
        System.out.printf("your balance is %.2f", account.getBalance());




    }
}
