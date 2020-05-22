package ch04;

import java.util.Scanner;

public class arrayB {
    public static void main (String [] args){
     Scanner Input = new Scanner(System.in);
        int Bilangan;
        Boolean kondisi = false;
        int [] array = {82,12,41,38,19,26,9,48,20,5,8,32,3};

  	System.out.println("mencari angka array");
        System.out.print("masukkan bilangan = ");
        Bilangan = Input.nextInt();
        for (int x = 0; x < array.length; x++) {
            if (Bilangan == array[x]) {
                System.out.println(Bilangan + " termasuk bilangan array");
                kondisi = true;
                break;
            }
        }
        if (kondisi == false){
            System.out.println("Bilangan " + Bilangan + " tidak termasuk bilanagn array");
        }
    }
}
