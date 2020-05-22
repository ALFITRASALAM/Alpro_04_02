package ch04 ;

public class arrayN {

  public static void main (String [] args ){
    
 int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

 int hasil = 0;

 for (int x = 0; x < array.length; x++) {

 System.out.print("angka  " + array[x] + " dijumlahkan dengan angka-angka sebelumnya = ");

 System.out.println(array[x] + hasil);

 hasil = hasil + array[x];

    }
  }
}
