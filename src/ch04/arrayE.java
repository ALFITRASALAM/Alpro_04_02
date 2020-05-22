
package ch04;


import java.util.Arrays;

public class arrayE {
    public static void main (String [] args){
        int [] array1 = {82,12,41,38,19,26,9,48,20,5,8,32,3};
        int [] angka2 = new int [array1.length];
        for (int x  = 0; x < array1.length; x++){
            if (array1[x] % 2 == 0) {
                angka2 [x] = array1[x];
            }
        }

        //Menampilkan Index yang memiliki Bilangan 2
        Arrays.sort(angka2);
        System.out.print("[");
        for (int x = 6; x < angka2.length; x++ ){
            if (angka2[x] != 0){
                if (x == 10){
                    continue;
                }
                if (x == 11){
                    continue;
                }
                System.out.print(angka2[x] + " ");
            }
        }
        System.out.print("]");

    }
}


