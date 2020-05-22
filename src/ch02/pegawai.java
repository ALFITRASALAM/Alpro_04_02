package ch02;

public class pegawai {
	String nik ;
	String nama ;
	String jabatan ;
	boolean isaktif ;

public String getnik () {
return nik ;
}

public String getnama (){
return nama ;
}

public String getjabatan (){
return jabatan ;
}

public boolean isaktif (){
return isaktif ;
}

public void cetak () {
	System.out.println("Nik : " + nik);
	System.out.println("Nama : " + nama);
	System.out.println("Jabatan : " + jabatan);
	System.out.println("Status : " + isaktif);
}
}