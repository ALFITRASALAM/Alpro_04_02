package ch03;

import java.util.Scanner;

public class nilaitertinggixyz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai x = ");
        int x = input.nextInt();
        System.out.println("Nilai y = ");
        int y = input.nextInt();
        System.out.println("Nilai z = ");
        int z = input.nextInt();

        if (x > y && x > z){
            System.out.println("x lebih besar dari y dan z");
        } else if (y > x && y > z) {
            System.out.println("y lebih besar dari x dan z");
        }
        else
        {
            System.out.println("z lebih besar dari x dan y");
        }
    }
}
