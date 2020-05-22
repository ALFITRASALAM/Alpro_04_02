package ch04;

public class arrayC {
    public static void main (String [] args){
        int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("Bilangan Ganjil");
        for (int x=0; x<array.length; x++){
            if ( array [x] %2 !=0){
                System.out.print( array [x] + " ");
            }
        }
    }
}
