public class lesson7 {

    public static void main(String [] args){
        Cat cat1 = new Cat("Murzik",true ,25);
        Cat cat2 = new Cat("Tom", true, 15);
        Cat cat3 = new Cat("Cezar",true, 50);
        Plates plates = new Plates(50);
        Cat [] kitties = new Cat [3];
        kitties[0] = cat1;
        kitties[1]= cat2;
        kitties[2] = cat3;

       for (int count1=0; count1 < kitties.length; count1++) {
           plates.FullfilmentPlate();
           kitties[count1].GetEat(plates);
            kitties[count1].CheckHungry(plates);
        }
    }
}
