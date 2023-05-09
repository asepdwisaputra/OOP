package oop.Absensi7.Code2;

public class MainMakhlukHidup
{
    public void cekMahlukHidup(MakhlukHidup mHidup)
    {
        mHidup.berdiri();
    }
    
    public static void main(String[] args) {
        MainMakhlukHidup mh = new MainMakhlukHidup();
        mh.cekMahlukHidup(new Manusia("Dua Kaki"));
    }
}
