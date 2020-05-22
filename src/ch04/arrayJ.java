package ch04 ;

public class arrayJ{
  public static void main (String [] args ){
         int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 5, 8, 32, 3};
        int[] x = new int[array.length];
        int[] array2 = new int[array.length];

    System.out.println( "selisihnya adalah");
    for (int a = 1; a < array.length; a++) {
    if (array[a] %2 == 0 && array[a-1] %2 == 0) {
    System.out.print("Hasil dari " + array[a - 1] + " - " + array[a] + " = ");
    System.out.println(array[a - 1] - array[a] + " ");
            }
        }
    }
}