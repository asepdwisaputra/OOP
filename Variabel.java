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
class variabel {
    int lebar;
    int panjang;
}

class NewClass2
{
    public static void main(String[] args) {
        
        double luas;
        variabel p = new variabel();
        p.panjang = 20;
        p.lebar = 10;
        luas = p.panjang * p.lebar;
        System.out.println("Luas persegi : "+luas);
    }
}
