package ch05 ;

public class kadane {
    public static void main ( String [] args ) { 
        int [] array = {3,-2,4,-6,7,8,-3};


       
     int kadane = 0;
      
      int max = 0;
      
         
   for (int jumlah : array) {
       
         int i = Integer.parseInt(String.valueOf(jumlah));

   
             max = Math.max(0, max + i);
               
 kadane = Math.max(kadane, max);
   
         }

            System.out.println("Hasilnya adalah " +kadane);


   
     }
}



