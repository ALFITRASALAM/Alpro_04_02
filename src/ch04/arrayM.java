package ch04 ;


public class arrayM {

public static void main (String [] args ){
    
 int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

 int nilai = 0;
 
 for ( int x = 0; x < array.length; x ++ ){
     if ( x < array[x]){
         int selisih = array[x] - array[x+1];
         
         nilai= nilai + selisih ;
         
     }
     System.out.println (nilai);
 } 
    }
}
 
