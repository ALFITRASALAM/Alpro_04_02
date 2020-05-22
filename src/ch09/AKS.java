package ch09;



import java.util.Scanner;



 public class AKS {



      static long m[] = new long[50];




    static void koef(int n)

    {
     

   m[0] = 1;
 

       for (int x = 0; x < n; m[0] = -m[0], x++) {

            
m[1 + x] = 1;

 
 
          for (int y = x; y > 0; y--)
  

              m[y] = m[y - 1] - m[y];
    
    }

    }




    static boolean prima(int n)
 
   {

       
 koef(n);

   

     m[0]++;
 

       m[n]--;


        int x = n;

 

       while ((x--) > 0 && m[x] % n == 0);



        return x < 0;
 

   }

 

   public static void main(String[] args)
    {
 

       Scanner input = new Scanner(System.in);
  

      System.out.println("masukkan angka = ");
  

      int n = input.nextInt();
 

       if (prima(n))
 

           System.out.println(n+ " termasuk bilangan prima");
        

else
  

          System.out.println(n+ " tidak bilangan prima ");


    }


} 

