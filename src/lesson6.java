import java.util.concurrent.Callable;

public class lesson6 {
    public static class Cat extends Animals{
        public Cat (int RunLimit, int SmimLimit){
            super(RunLimit, SmimLimit);
        }
        @Override
        void SetName(String Name) {
            super.SetName(Name);
        }
    }
    public static class Dog extends Animals{
        public Dog (int RunLimit, int SmimLimit){
            super(RunLimit, SmimLimit);
        }
        @Override
        void SetName(String Name) {
            super.SetName(Name);
        }
    }
    public static void main(String[] args){
       Cat kitty = new Cat(200,0);
       kitty.SetName("Frosia");
       kitty.Run(300);
       Dog doggy = new Dog(500,10);
       doggy.SetName("Jimmy");
       doggy.Run(400);
       doggy.Swim(20);
Animals[]animals={kitty,doggy};
System.out.println(animals.length);
    }
}
