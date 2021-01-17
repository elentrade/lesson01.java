public class lesson01 {
    //chapter 2
    int i = 1;
    byte b = 2;
    short s = 100;
    long l = 99999l;
    float f = 0.01f;
    final double pi = 3.14;
    char c = '!';
    boolean test = 5>10;
    //chapter 3
    static double formula(float A,float B,float C,float D) {
        System.out.println(A+"*("+B+"+("+C+"/"+D+"))=");
        return (double)(A*(B+(C/D)));
    }
    //chapter 4
    static boolean check(int number1, int number2){
        if ((number1+number2)>10 && (number1+number2)<20)
            return true;
        else
            return false;
    }
    //chapter 5
    static void check0(int number){
        if (number<0)
            System.out.println("Number "+number+" is <0");
        else
            System.out.println("Number "+number+" is >=0");
    }
    //chapter 6
    static boolean check00(int number3){
        if (number3<0)
            return true;
        else
            return false;
    }
    //chapter 7
    static void greeting (String AnyName){
        String mineName = AnyName;
        System.out.println("Have a nice day, "+mineName+"!");
    }

    //chapter 8
    static void year366 (int year){
        if (year%4==0)
            if (year%400 ==0)
               System.out.println("Year "+year+" have 366 days");
            else
               if (year%100 ==0)
                    System.out.println("Year "+year+" have 365 days");
               else
                    System.out.println("Year "+year+" have 366 days");
        else
            System.out.println("Year "+year+" have 365 days");
    }
    //execute metod

    public static void main(String[] args){
            System.out.println("chapter 3");
            System.out.println(formula(5.6f, 6.8f, 1.3f, 3.1f));
            System.out.println("chapter 4");
            System.out.println("Checking result is "+check(6,8));
            System.out.println("chapter 5");
            check0(200);
            System.out.println("chapter 6");
            System.out.println(check00(-999));
            System.out.println("chapter 7");
            greeting("Elena");
            System.out.println("chapter 8");
            year366(2109);
    }
}

