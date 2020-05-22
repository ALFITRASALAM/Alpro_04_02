package ch03;

import java.util.Scanner;

public class nilaitertinggixy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai x = ");
        int x =  input.nextInt();
        System.out.println("Nilai y = ");
        int y = input.nextInt();

        if (x > y){
            System.out.println("x lebih besar dari y");
        }
        else {
            System.out.println("y lebih besar dari x");
        }
    }
}
