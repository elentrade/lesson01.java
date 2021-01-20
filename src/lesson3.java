import java.util.Random;
import java.util.Scanner;

public class lesson3 {
   public static void Game() {
       Random rn = new Random();
       Scanner sc = new Scanner(System.in);
       Scanner sc1 = new Scanner(System.in);
       int Choice = 1;
       while (Choice == 1) {
           int GuessNum = rn.nextInt(10);
           System.out.println("Try to guess a number from 0 to 9");
           int InputNum = sc.nextInt();

           for (int i = 0; i < 3; i++) {
               if (InputNum == GuessNum) {
                   //sc.nextLine();
                   System.out.println("You have win. Would you like play again? Yes - 1/No - 0");
                   break;
               }
               if (InputNum > GuessNum) {
                   sc.nextLine();
                   System.out.println("Your number > guess number");
                   if (i == 2) {
                       System.out.println("You have lose. Would you like play again? Yes - 1/No - 0");
                       break;
                   } else {
                       InputNum = sc.nextInt();
                   }

               }
               if (InputNum < GuessNum) {
                   sc.nextLine();
                   System.out.println("Your number < guess number");
                   if (i == 2) {
                       System.out.println("You have lose. Would you like play again? Yes - 1/No - 0");
                       break;
                   } else {
                       InputNum = sc.nextInt();
                   }

               }

           }

           Choice = sc1.nextInt();
       }

       System.out.println("Game is over");

   }

    public static void main(String[]args){
Game();

    }
}
