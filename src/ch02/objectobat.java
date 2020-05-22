package ch02 ;

import java.util.Date;

public class objectobat {

public static void main (String [] args) {

obat x1 = new obat () ;
x1.barcode = " 9348399348 " ;
x1.nama = " paramex" ;
x1.tanggalkedaluarsa = new Date (2020,10,20);
x1.harga = 6000 ;

obat x2 = new obat () ;
x2.barcode = " 9348399349 " ;
x2.nama = " badrex " ;
x2.tanggalkedaluarsa = new Date (2020,11,6);
x2.harga = 7500 ;

System.out.println (x1.nama + " (" + x1.barcode + ")");
System.out.println ("harga : Rp" + x1.harga);
System.out.println ("Exp : " + x1.tanggalkedaluarsa.toString());
System.out.println("================");
System.out.println (x2.nama + " (" + x2.barcode + ")");
System.out.println ("harga : Rp" + x2.harga);
System.out.println ("Exp : " + x2.tanggalkedaluarsa.toString());

}
} 