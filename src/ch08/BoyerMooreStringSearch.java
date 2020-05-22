package ch08;
import java.util.HashMap;
import java.util.Map;


public class BoyerMooreStringSearch {

    public static void main(String[] args) {
        String pola = "bola";

        String teks = " sepakbola";
        search(pola, teks);
    }
    
    public static void search(String pola, String teks) {
        Map<Character, Integer> mt = new HashMap();
        for (int i = 0; i < pola.length(); i++) {
            mt.put(pola.charAt(i), i);
        }
        int lewat = 0;
        int y = teks.length();
        int x = pola.length();
        for (int i = 0; i <= y-x; i= i+ lewat) {
            lewat = 0;
            for (int j = x - 1; j >= 0; j--) {
                if (pola.charAt(j) != teks.charAt(i+j)) {
                    if(mt.get(teks.charAt(i + j))!=null)
                        lewat = Math.max(1, j - mt.get(teks.charAt(i + j)));
                    else
                        lewat = j+1;
                    break;
                }
            }
            if (lewat == 0) {
                System.out.println("Kecocokan ada di index " + i);
                lewat = 1;
            }
        }
    }

   
    public int search(String teks) {
        String pola = "";
        int r = 256;
        int[] benar = new int[r];
        for (int a = 0; a < r; a++)
            benar[a] = -1;
        for (int j = 0; j < pola.length(); j++)
            benar[pola.charAt(j)] = j;

        int x = pola.length();
        int y = teks.length();
        int lewat;
        for (int i = 0; i <= y - x; i += lewat) {
            lewat = 0;
            for (int j = x - 1; j >= 0; j--) {
                if (pola.charAt(j) != teks.charAt(i + j)) {
                    lewat = Math.max(1, j - benar[teks.charAt(i + j)]);
                    break;
                }
            }
            if (lewat == 0)
                return i; 
        }
        return y; 
    }
}
