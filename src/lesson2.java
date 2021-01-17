import java.util.Arrays;

public class lesson2 {
    //chapter 1
    static void ReplaceNumber(){
    int arr[] ={1,0,0,1,1,0,1,0,1,0};
    System.out.println("Array before replacing: "+Arrays.toString(arr));
    for ( int i=0;i<arr.length;i++) {
        if (arr[i]==0) {
            arr[i] = 1;
        }
        else {
            arr[i] = 0;
        }
    }
        System.out.println("Array after replacing: "+Arrays.toString(arr));
    }
    //chapter 2
    static void FillArray(){
        int arr[] = new int[8];
        for (int i=0;i< arr.length;i++){
            arr[i]=i*3;
        }
        System.out.println("Array after filling: "+Arrays.toString(arr));
    }
    //chapter 3
    static void MultiplyArray(){
    int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Array before multiplying members: "+Arrays.toString(arr));
    for (int i=0; i< arr.length;i++){
    if(arr[i]<6) {
    arr[i] =arr[i]*2;
    }
    }
    System.out.println("Array after multiplying members: "+Arrays.toString(arr));
    }
    //chapter 4
    static void MakeDiagonal() {
        int arr[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //оба индекса должны быть либо четными, либо нечетными
                    if ((i % 2 == 0 && j % 2 == 0)||(i % 2 > 0 && j % 2 > 0)) {
                        arr[i][j] = 1;
                    }
                }
        }
//вывод массива хз почему так
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //chapter 5
    static void FindExtremumInArray(){
        int arr[]={8,12,5,9,1,0,3};
        int max=0, min=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Maxinum in array "+Arrays.toString(arr)+" = "+max);
        System.out.println("Mininum in array "+Arrays.toString(arr)+" = "+min);
    }
    //chapter 6
   // static boolean FindBalance(int[]arr){
      static boolean FindBalance(){
      int arr[]={4,8,0,6,9,11,5,1,36,8};
      int i=0;
      int j=0;
      int summa = 0; //sum of all array`s members
      int right=0;//count sum from right
      while (i<=arr.length-1){
      summa = summa+arr[i];
      i++;
      }
          while (j < arr.length-1) {
              right = right + arr[j];
              System.out.println(summa/2+"/"+right);
              if (right==summa/2){
                  break;
              }
              j++;
          }
        if (right!=summa/2){
            return false;
        }
        else {
            return true;
        }
      }



    public static void main(String[] args){
        System.out.println("//chapter 1");
        ReplaceNumber();
        System.out.println("//chapter 2");
        FillArray();
        System.out.println("//chapter 3");
        MultiplyArray();
        System.out.println("//chapter 4");
        MakeDiagonal();
        System.out.println("//chapter 5");
        FindExtremumInArray();
        System.out.println("//chapter 6");
        System.out.println(FindBalance());
        System.out.println("//chapter 7");

    }
}
