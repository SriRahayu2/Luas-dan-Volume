package com.tutorial;

import java.util.Scanner; 

public class Luas_Volume {
    public static void main(String[] args) {
        final double Phi = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME TABUNG");
        System.out.println("Jari-jari alas: ");
        double r = input.nextDouble();

        System.out.println("Tinggi tabung: ");
        double t = input.nextDouble();
        
        double luasTabung = 2 * (Phi * r * r) + (2 * Phi * r * t);
        double volTabung = (Phi * r * r) * t;
        
        System.out.println("Luas Tabung = " + luasTabung);
        System.out.println("Volume Tabung = " + volTabung);
    
    input.close();
    }
}