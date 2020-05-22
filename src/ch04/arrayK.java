package ch04;


public class arrayK {
 public static void main ( String [] args){
     int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println( "hasilnya" );
        for (int x = 1; x < array.length; x++){
            if ( array[x] > array[x-1]){
             
                System.out.print(array[x] + " ");
            }
        }
        
    }

}
