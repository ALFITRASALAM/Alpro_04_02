package ch06 ;

public class selectionsort {
       public static void main(String[] args) {
            int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int a = 0; a < arrayAngka.length-1; a++){
            int terkecil = a;
            for (int b = a+1; b < arrayAngka.length; b++){
                if (arrayAngka[b] < arrayAngka[terkecil]){
                    terkecil = b;
                    int urutan = arrayAngka[terkecil];
                    arrayAngka[terkecil] = arrayAngka [a];
                    arrayAngka[a] = urutan;
                }
            }
        }
        for (int a = 0; a < arrayAngka.length; a++){
        System.out.println(arrayAngka[a]);
        }
       }
}