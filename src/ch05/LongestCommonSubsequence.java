package ch05;



public class LongestCommonSubsequence {


int lcs( char[] A, char[] B, int x, int y )
    {

 
       if (x == 0 || y == 0)
            

	return 0;
     

   if (A[x-1] == B[y-1])
        

    return 1 + lcs(A, B, x-1, y-1);
      

  else
           

     return max(lcs(A, B, x, y-1), lcs(A, B, x-1, y));
 

   }
   

 int max(int a, int b)
 

   {
       

 return (a > b)? a : b;


    }
 

   public static void main(String[] args)
    {
 

       LongestCommonSubsequence lcs = new LongestCommonSubsequence();


        String s1 = "alfitra";
      

  String s2 = "salam";
      

  char[] A=s1.toCharArray();
     

   char[] B=s2.toCharArray();
    

    int x = A.length;
      

  int y = B.length;
   

     System.out.println("Panjangnya adalah" + " " +
       

         lcs.lcs( A, B, x, y ) );
   
 
}


}

