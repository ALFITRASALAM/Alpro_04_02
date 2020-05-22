package ch04;

public class arrayH {
    public static void main (String [] args){
        int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        int x = 0;
        for (int i : array){
            x = x + i;
            System.out.println("jumlah seluruh angka adalah\n"  + x);
        }
    }
}
        
            