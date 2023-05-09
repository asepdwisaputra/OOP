package oop.Absensi7;

import java.*;
import java.io.*;

abstract class P
{
    abstract public void method2();
    int x,y,z;
    
    public void method1()
    {
        System.out.println("Method nyata dari kelas P");
        System.out.println("Nilai x,y ditentukan dalam kelas P");
        x=12;
        y=10;
    }
}

class Q extends P
{
    public void method2()
    {
        System.out.println("Method abstrak yang sudah menjadi nyata dalam class P");
        z=x+y;
        
        System.out.println("Hasil perhitungan = "+z);
        System.out.println("-");
    }
}

class Abstraksi_sederhana {
    public static void main(String[] args) {
        Q object = new Q();
        object.method1();
        object.method2();
    }
}
