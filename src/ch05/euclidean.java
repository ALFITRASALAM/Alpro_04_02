package ch05 ;

import java.util.Scanner;

public class euclidean {
    public static void main  (String [] args){
        int m, n, r;
        System.out.println("nama : alfitra salam");
        System.out.println (" kelas : tif 2d");
        Scanner ras = new Scanner (System.in);
        System.out.print("masukkan nilai m :");
        m = ras.nextInt();
        System.out.print ("masukakan niali n : ");
        n = ras.nextInt();
        r = m%n;
        while (r !=0){
            m=n;
            n=r;
            r=m%n;
            
            System.out.print("FPB =" +n);
        }
               
               
    }
    
}
