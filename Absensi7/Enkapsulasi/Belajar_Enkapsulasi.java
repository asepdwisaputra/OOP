package oop.Absensi7.Enkapsulasi;

public class Belajar_Enkapsulasi {
    public static void main(String[] args) {
        Encapsulation objek = new Encapsulation();
        objek.ModifNama("Asep");
        objek.ModifAlamat("Purbalingga");
        objek.ModifNim("STI202102126");
        System.out.println("Nama : "+objek.getNama());
        System.out.println("Alamat : "+objek.getAlamat());
        System.out.println("NIM : "+objek.getNim());
    }
}
