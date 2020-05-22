package ch02 ;

public class objectfakultas {

public static void main (String [] args) {
	fakultas fk1 = new fakultas ();
	fakultas fk2 = new fakultas ();

fk1.nama = " sains dan teknologi ";
fk1.jumlahmahasiswa = 2345 ;

fk2.nama = " psikologi ";
fk2.jumlahmahasiswa = 1202;

System.out.println("fakultas " + fk1.getnama() + " : " + fk1.getjumlahmahasiswa ());
System.out.println("fakultas " + fk2.getnama() + " : " + fk2.getjumlahmahasiswa ());
}
} 