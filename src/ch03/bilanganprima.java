package ch03;

import java.util.Scanner;

public class bilanganprima
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int x, y, nilai;
        boolean prima;
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();

        while (nilai<= 1)
        {
            System.out.println("\n\nNilai harus lebih besar dari 1\n \nMasukkan nilai : ");
            nilai = input.nextInt();
        }
        for (x=nilai;x<=nilai;x++)
        {
            prima=false;
            if (x==2)
                prima=true;
            else
            {
                for (y=2;y<x;y++)
                {
                    if (x % y==0)
                    {
                        prima=false;
                        System.out.println ("Bukan Bilangan Responsi5.Prima, Silahkan Coba Lagi");
                        break;
                    }
                    else
                        prima=true;
                }
            }
            if (prima)
            {
                System.out.println("Termasuk Bilangan Responsi5.Prima");

            }
        }

    }
}