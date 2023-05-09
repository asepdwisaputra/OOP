package oop.Absensi7.Code2;

public class Manusia extends MakhlukHidup{
    private String duakaki;
    private String bernafas;
    
    public Manusia(String duakaki){
        this.duakaki=duakaki;
    }
    
    public void berdiri(){
        System.out.println("Manusia berdiri menggunakan : "+duakaki);
    }
}
