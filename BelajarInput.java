package oop;

import java.util.Scanner;

public class BelajarInput {
    public static void main(String[] args) {
        String nama, jurusan, fakultas, universitas;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        nama = input.nextLine();
        
        System.out.println("Jurusan : ");
        jurusan = input.nextLine();
        
        System.out.println("Fakultas : ");
        fakultas = input.nextLine();
        
        System.out.println("Universitas : ");
        universitas = input.nextLine();
    }
}