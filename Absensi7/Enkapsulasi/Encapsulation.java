package oop.Absensi7.Enkapsulasi;

public class Encapsulation {
    private String nama;
    private String alamat;
    private String nim;
    
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNim(){
        return this.nim;
    }
    
    public void ModifNama(String nama){
        this.nama = nama;
    }
    
    public void ModifAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void ModifNim(String nim){
        this.nim = nim;
    }
}
