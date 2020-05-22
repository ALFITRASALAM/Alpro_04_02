package ch06 ;

public class bubblesort {
       public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        for (int a = 0; a < arrayAngka.length; a++){
            for (int b = 0; b < arrayAngka.length-1;b++){
                boolean urutan = arrayAngka[b] < arrayAngka[b+1];
                if (!urutan){
                    int baru = arrayAngka[b];
                    arrayAngka[b] = arrayAngka [b+1];
                    arrayAngka[b+1] = baru;
                }
            }
        }
        for (int a = 0; a < arrayAngka.length; a++){
             System.out.print(arrayAngka[a]+ " ");
}
    }
}