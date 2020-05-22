package ch04;

public class arrayF {
    public static void main (String [] args){
         
 int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("angka-angka ganjil di apit oleh angka genap");
        for (int x=0; x<array.length; x++){
            if (array [x] %2 !=0){
            if (array [x] > 3)
                System.out.print(array[x] + " ");
            }
        }
    }
}
  