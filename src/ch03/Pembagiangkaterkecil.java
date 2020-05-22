package ch03;

import java.util.Scanner;
public class Pembagiangkaterkecil {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int angka = x.nextInt();
        int faktor = 2;
        System.out.println("Angka " + angka +", Faktor Terkecilnya adalah ");

        for (int y = 0; y < angka; y++) {
            faktor++;
            if (angka % faktor == 0) {
                System.out.println(faktor);
                break;
            }

        }
    }
}



