package ch04 ;

public class arrayL {
  public static void main (String [] args ){
  int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
  for (int x = 1; x < array.length; x++) {
  
 
  if (array[x] % 2 == 0 && array[x - 1] % 2 == 0) {
  System.out.print("hasil dari " + array [x - 1] + " + " + array[x] + " = ");
 System.out.println(array[x - 1] + array[x] + " ");
            
  }
  }
    }

}
