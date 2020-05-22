package ch06 ;

public class insertionsort {
       public static void main(String[] args) {
          int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int a = 0; a < arrayAngka.length; a++) {
            int urutan = arrayAngka [a];
            int b = a-1;

            while (b >= 0 && arrayAngka[b] > urutan) {
                arrayAngka [b+1] = arrayAngka[b];
                arrayAngka[b] = urutan;
                b = b-1;
            }
        }
        for (int a = 0; a < arrayAngka.length; a++) {
            System.out.println(arrayAngka[a]);
        }
       }
}
    