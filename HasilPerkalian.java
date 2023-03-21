/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ASUS
 */
class kali{
    double a;
    double b;
    
    void hasil()
    {
        System.out.println("Hasil Perkalian = "+(a*b));
    }
}

public class HasilPerkalian {
    public static void main(String[] args) {
        kali variabel1, variabel2;
        
        variabel1 = new kali();
        variabel2 = new kali();
        
        variabel1.a = 3;
        variabel1.b = 6;
        
        variabel2.a = 5;
        variabel2.b = 10;
        
        variabel1.hasil();
        variabel2.hasil();
    }
}
