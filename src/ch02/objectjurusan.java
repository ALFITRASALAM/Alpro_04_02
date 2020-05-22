package ch02;

public class Objectjurusan {
    public static void main(String[] args) {
        jurusan j1 = new jurusan();
        jurusan j2 = new jurusan();
        jurusan j3 = new jurusan();

        j1.nama = "Teknik Informatika";
        j1.akreditasi = "A";
        j1.JumlahMahasiswa = 1200;


        j2.nama = "Teknik Elektro";
        j2.akreditasi = "B";
        j2.JumlahMahasiswa = 1095;


        j3.nama = "Teknik Industri";
        j3.akreditasi = "B";
        j3.JumlahMahasiswa = 780;

        System.out.println("==Jurusan 1");
        System.out.println("Nama : " + j1.getNama());
        System.out.println("Akreditasi : " + j1.getAkreditasi());
        System.out.println("Jumlah Mahasiswa : " + j1.getJumlahMahasiswa() + "\n");

        System.out.println("==Jurusan 2");
        System.out.println("Nama : " + j2.getNama());
        System.out.println("Akreditasi : " + j2.getAkreditasi());
        System.out.println("Jumlah Mahasiswa : " + j2.getJumlahMahasiswa() + "\n");

        System.out.println("==Jurusan 3");
        System.out.println("Nama : " + j3.getNama());
        System.out.println("Akreditasi : " + j3.getAkreditasi());
        System.out.println("Jumlah Mahasiswa : " + j3.getJumlahMahasiswa());


    }
}
