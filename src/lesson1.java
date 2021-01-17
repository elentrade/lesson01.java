import java.util.Scanner;

public class lesson1 {
    public static void main(String [] args){
        System.out.println("Choose operation:");
        System.out.println("1 - Adding");
        System.out.println("2 - Increasing");
        System.out.println("3 - Multiplying");
        System.out.println("4 - Dividing");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Enter first number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int n2 = scanner.nextInt();
        if (operation == 1) {
            System.out.println("Result of operation is "+(n1+n2));
        }
        else if (operation==2) {
            System.out.println("Result of operation is "+(n1-n2));
        }
        else if (operation==3) {
            System.out.println("Result of operation is "+(n1*n2));
        }
        else if (operation==4) {
            if (n2 == 0) {
                System.out.println("Operation isn`t possible");
            }
            else {
                System.out.println("Result of operation is "+(n1/n2));
            }
        }
        else {
            System.out.println("You choose uncorrect operation");
        }

    }
}



