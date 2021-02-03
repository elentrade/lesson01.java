import java.util.Scanner;

public class Plates {
    int Meal;
    Plates(int Meal){
        this.Meal = Meal;
    }

    public void FullfilmentPlate(){
        System.out.println("There is "+this.Meal+ "food at a plate");
    }
    public void FillPlate(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Do you want to feel a plate? Enter 1 for yes or 0 for not");
        int Input = scn.nextInt();

        if(Input==1){
            System.out.println("Enter portion you want to give from 1 to 100");
            int Quantiy = scn.nextInt();
            this.Meal = this.Meal+Quantiy;
            System.out.println(this.Meal+ " in plate now");

        }
        if (Input==0){
            System.out.println("Cats are in diet");
        }
    }
}

