package ch02;

public class mahasiswa {
	String nim ;
	String nama ;
	String alamat ;
	String hp ;

public String getnim () {
return nim ;
}

public String getnama () {
return nama ;
}

public String getalamat () {
return alamat ;
}

public String gethp () {
return hp ;
}

public void cetak () {
	System.out.println ("Nim : " + nim);
	System.out.println ("Nama : " + nama);
	System.out.println ("Alamat : " + alamat);
	System.out.println ("Hp : " + hp);
}
}