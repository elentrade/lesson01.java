public class Cat {
    String Name;
    boolean IsHungry;
    int Appetit;
    Cat (String Name, boolean IsHungry, final int Appetit ){
        this.Name = Name;
        this.IsHungry = IsHungry;
        this.Appetit = Appetit;
    }
    public void GetEat(Plates plates){
        System.out.println(this.Name+ " have appetit " + this.Appetit);
        if (this.Appetit<plates.Meal || this.Appetit==plates.Meal){
            plates.Meal = plates.Meal - this.Appetit;
            this.IsHungry = false;
            System.out.println ("Cat "+ this.Name+" have eat and now is happy! Hungry== "+this.IsHungry);
        }
        else {
            System.out.println("Cat "+this.Name+" is sad and hungry== "+this.IsHungry);
            System.out.println ("Add "+ (this.Appetit- plates.Meal)+" meal to plate for "+this.Name);
        }

    }
    public void CheckHungry(Plates plates){
        if (this.IsHungry && plates.Meal<this.Appetit){
         plates.FillPlate();
         this.GetEat(plates);
        }
    }
}
