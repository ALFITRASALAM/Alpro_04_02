package ch09;

public class sieveoferatosthenes {
     public static void main(String[] args) {
                int akhir = 50;
        System.out.println("Bilangan prima yang terdapat pada 1 - 50, yaitu");
        boolean prima[] = new boolean[akhir+1];

        for (int x = 0; x <= akhir; x++){
            prima [x]= true ;
        }
      
        for (int y = 2; y*y <= akhir; y++){
            if (prima[y] == true) {
                for (int x = y*y; x <= akhir; x+= y){
                    prima [x] = false;}
            }
        }


        for (int x = 2; x <= akhir; x++){
            if (prima[x] == true)
                System.out.println(x);
        }
    }
}