package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelajarInput2 {
    public static void main(String[] args) throws IOException{
        String nama;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Nama : ");
        nama = br.readLine();
    }
}
