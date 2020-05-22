package ch08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class KnuthMorrisPratt {
      private final int[] failure;
    public KnuthMorrisPratt(String text, String pat)
    {
        /** pre construct failure array for a pattern **/
        failure = new int[pat.length()];
        fail(pat);
        /** find match **/
        int pos = posMatch(text, pat);
        if (pos == -1)
            System.out.println("\nTidak di Temukan Kecocokan");
        else
            System.out.println("\nKecocokan di Temukan Pada Index ke- "+ pos);
    }
    /** Failure function for a pattern **/
    private void fail(String pat)
    {
        int z = pat.length();
        failure[0] = -1;
        for (int y = 1; y < z; y++)
        {
            int x = failure[y - 1];
            while ((pat.charAt(y) != pat.charAt(x + 1)) && x >= 0)
                x = failure[x];
            if (pat.charAt(y) == pat.charAt(x + 1))
                failure[y] = x + 1;
            else
                failure[y] = -1;
        }
    }
    /** Function to find match for a pattern **/
    private int posMatch(String text, String pat){
        int x = 0, y = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (x < lens && y < lenp)
        {
            if (text.charAt(x) == pat.charAt(y))
            {
                x++;
                y++;
            }
            else if (y == 0)
                x++;
            else
                y = failure[y - 1] + 1;
        }
        return ((y == lenp) ? (x - lenp) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mencoba Knuth Morris Pratt\n");
        System.out.println("\nMasukkan Teks\n");
        String text = br.readLine();
        System.out.println("\nMasukkan Pola\n");
        String pattern = br.readLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);
    }
}


