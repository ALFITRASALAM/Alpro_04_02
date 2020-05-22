package ch09;

import java.util.Arrays;
public class sieveofsundaram {
    static int sieveofsundaram(int z) {
        int nNew = (z - 2) / 2;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);
        for (int x = 1; x <= nNew; x++)
            for (int y = x; (x + y + 2 * x * y) <= nNew; y++)
                marked[x + y + 2 * x * y] = true;
        //2 adalah bilangan prima
        if (z > 2)
            System.out.print(2 + " ");
        for (int x = 1; x <= nNew; x++)
            if (marked[x] == false)
                System.out.print(2 * x + 1 + " ");
        return -1;
    }
    // Driver code
    public static void main(String[] args) {
        int z = 50;
        sieveofsundaram(z);
    }
}

