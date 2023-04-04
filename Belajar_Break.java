/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel1;

/**
 *
 * @author ACER
 */
public class Belajar_Break {
    public static void main(String[] args) {
        for(int a=1; a<=10; a++){
            System.out.println("Selamat Berbuka");
            
            a=a+1;
            if (a==5)
                break;
        }
        System.out.println("Proses Berhenti pada perulangan ke-5");
    }
}
