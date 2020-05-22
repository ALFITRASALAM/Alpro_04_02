package ch07;

public class mergesort {
      public static void main(String a[]){
    int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("Sebelum di Urutkan merge sort ");
        for(int x = 0; x < array.length; x++)
        {
            System.out.print(array[x]+" ");
        }
        System.out.println();

        diurutkan(array,0,array.length-1);
        System.out.println();
        System.out.println("Setelah di Urutkan merge sort ");
        for(int x = 0; x < array.length; x++)
        {
            System.out.print(array[x]+" ");
        }

    }
    public static void diurutkan(int array[], int b, int c)
    {
        int kecil = b;
        int besar = c;
        if (kecil>=besar)
        {
            return;
        }
        //cari nilai tengah atau median

        int mid=(kecil+besar)/2;
        diurutkan(array,kecil,mid);
        diurutkan(array,mid+1,besar);
        int end_kecil=mid;
        int awal=mid+1;
        while ((b<=end_kecil) && (awal<=besar))
        {
            if (array[kecil]<array[awal])
            {
                kecil++;
            }
            else
            {
                int baru=array[awal];
                for (int n=awal-1;n>=kecil;n--)
                {
                    array[n+1]=array[n];
                }
                array[kecil]=baru;
                kecil++;
                end_kecil++;
                awal++;
            }
        }
    }
}