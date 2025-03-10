import java.util.Scanner;

public class Banking{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //Basic banking activities
        //Learning - during this activity i have implemented methods with returning parameters,
        // And understood variable scope while using Scanner class
        double balance = 0;
        int choice;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("\n <----------- Banking Activities --------------> \n");
            System.out.println("1. Balance\n2. Deposit\n3. Withdrawl\n4. Exit");
            System.out.print("Enter your choice of activity: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> System.out.println("\nYour Account balance is "+getBalance(balance));
                case 2 -> {
                    double deposit = doDeposit();
                    if(deposit > 0){
                        balance = balance + deposit;
                        System.out.println("\n Your new balance after deposit is " +balance);
                    }
                    
                }
                case 3 -> {
                    double withdraw = doWithdrawl(balance);
                    if(withdraw > 0){
                        balance = balance - withdraw;
                        System.out.println("\n Your new Balance after withdraw is "+balance);
                    }
                    
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("\nThank you for using our services!!!!\n");
                }
                default -> System.out.println("INVALID CHOICE :((");
            }
        }

        scanner.close();
    }
    static double getBalance(double balance){
        return +balance;
    }
    static double doDeposit(){
        System.out.print("Enter a amount you want to deposit: ");
        double amount = scanner.nextDouble();
        if(amount <0){
            System.out.println("you can't deposit negative amount");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double doWithdrawl(double balance){
        System.out.print("Enter an amount to be withdraw: ");
        double withdraw = scanner.nextDouble();
        if(withdraw < 0 ){
            System.out.println("You can't withdraw negative money");
            return 0;
        }
        else if(balance < withdraw) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else {
            return withdraw;
        }
    }
}