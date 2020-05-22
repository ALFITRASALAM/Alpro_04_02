package ch07;

public class blocksort {
      private blocksort(int[] array) {
        int z= array.length;
        for (int x = 1;x<z;x++) {
            int key = array [x];
            int y=x-1;
            while ((y>-1)&&(array[y]>key)){
                array[y+1] = array[y];
                y--;
            }
            array[y+1]=key;
        }
    }
    private int[] array;

    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //mengurutkan array menggunakan block sort

        System.out.println("Sebelum diurutkan block sort");
        for (int y:array){
            System.out.print(y+" ");
        }
        System.out.println();
        new blocksort(array);
        //sortir array menggunakan merge sort

        System.out.println("Setelah block sort");
        for(int y:array){
            System.out.print(y+" ");
        }
    }
}




