package ch05;



public class LongestIncreasingSubsequence {
 

  static int max_ref;
 

   static int _lis(int arr[], int x)
    {
 

       if (x == 1)
         

   return 1;
       

 int res, max_ending_here = 1;
    

    for (int y = 1; y < x; y++) {
         

   res = _lis(arr, y);
        

    if (arr[y - 1] < arr[x - 1] && res + 1 > max_ending_here)
    

            max_ending_here = res + 1;
     

   }
     

   if (max_ref < max_ending_here)
       

     max_ref = max_ending_here;
       

 return max_ending_here;
   

 }
  

  static int lis(int arr[], int x)
   

 {
  

      max_ref = 1;
     

   _lis(arr, x);
   

     return max_ref;
  

  }
  

  public static void main(String args[])
    {
   

     int arr[] = { 7, 10, 13, 6, 9, 5, 18, 15, 17, 11 };
   

     int x = arr.length;
  

      System.out.println("Panjangnya adalah " + lis(arr, x) + "\n");
    

}


}