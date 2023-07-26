import java.util.Scanner;

public class TerminalAccount {
    static void order(String order) {
        System.out.print(order+"\n>>> ");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        order("Please enter the Agency number.");
        String agencyNumber = sc.next();
        order("Please enter the Account number.");
        int accountNumber = sc.nextInt();
        order("Please enter your Name.");
        String name = sc.next();
        order("Please enter your Balence.");
        double balence = sc.nextDouble();
        String balenceString = String.format("%.2f", balence);
        
        System.out.println("Hello "+name+" thank you for creating an account in our bank, your branch is "+agencyNumber+", account "+accountNumber+" and your balence "+balenceString+" is now available for withdrawal");
        sc.close();
    }
}
