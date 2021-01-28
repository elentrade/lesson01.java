public class lesson5 {
    public static void main (String[]args){
       employee Petrov = new employee("Petrov Serge","Division director","petrov@gmail.ru","+79376803322",200000,55);
       Petrov.PrintPersonalData();

        employee [] arr1 = new employee[5];
        arr1[0]=  new employee("Ivanov Alex", "Sails manager", "ivanov@mail.ru","890090070",120000,30);
        arr1[1]=  new employee("Voronin Alexander", "HR manager", "voron@mail.ru","890090010",80000,32);
        arr1[2]= new employee("Stepanov Peter", "Ingeneer", "step@mail.ru","890090020",130000,46);
        arr1[3]= new employee("Gusev Alex", "Chief accounter", "gusev@mail.ru","890090060",170000,42);
        arr1[4]= new employee("Petrova Anna", "Business analist", "petrova@mail.ru","890090090",100000,33);


        for (int i=0;i < arr1.length;i++) {
          if(arr1[i].AgeFilter(40)){
            arr1[i].PrintPersonalData();
          }
        }
    }

}
