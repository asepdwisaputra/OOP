package variabel1;

public class Belajar_If_Else {
    public static void main(String[] args) 
    {
        String kategori = "";
        int nilai_UAS_PBO;
        
        nilai_UAS_PBO = 79;
        
        if (nilai_UAS_PBO > 85)
        {
            kategori = "Anda Lulus";
        }
        
        else
        { 
            kategori= "Anda tak Lulus";
        }
        System.out.println(kategori);
    }
}

