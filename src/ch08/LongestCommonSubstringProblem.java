package ch08;

public class LongestCommonSubstringProblem {
      static String x, y;
    // Returns length of function for longest common
    // substring of X[0..m-1] and Y[0..n-1]
    static int lcs(int a, int b, int count) {

        if (a == 0 || b == 0) {
            return count;
        }
        if (x.charAt(a - 1) == y.charAt(b - 1)) {
            count = lcs(a - 1, b - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcs(a, b - 1, 0), lcs(a - 1, b, 0)));
        return count;
    }
    // Driver code
    public static void main(String[] args){
        int n, m;
        x = "alfitra";
        y = "salam";

        n = x.length();
        m = y.length();
        System.out.println(lcs(n, m, 0));
    }
}

