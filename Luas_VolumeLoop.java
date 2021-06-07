package com.tutorial;

import java.util.Scanner; 

public class Luas_VolumeLoop {
    public static void main(String[] args) {
        final double Phi = 3.14;
        char yorn = 'n';
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME TABUNG");
            System.out.println("Choose : 1. Luas Permukaan Tabung ? ");
            System.out.println("Choose : 2. Volume Tabung ? ");
            System.out.println("Chosee : 3. DONE");
            int c = input.nextShort();
        
            // Luas Permukaan Tabung
            if (c == 1) {
                System.out.println("Jari-jari alas : ");
                double r = input.nextDouble();

                System.out.println("Tinggi tabung: ");
                double t = input.nextDouble();

                double luasTabung = 2 * (Phi * r * r) + (2 * Phi * r * t);
                System.out.println("Luas Tabung = " + luasTabung);
            }
            
            // Volume Tabung 
            else if (c == 2) {
                System.out.println("Jari-jari alas : ");
                double r = input.nextDouble();

                System.out.println("Tinggi tabung: ");
                double t = input.nextDouble();

                double volTabung = (Phi * r * r) * t;
                System.out.println("Volume Tabung = " + volTabung);
            }
        
            // DONE
            else if (c == 3) {
                System.out.println("DONE");
                System.exit(0);
            }
            
            else {
                System.out.println("Choose [1 - 3] ? ");
            }

            //Looping
            System.out.println("Repeat ? [y / n] ? ");
            input.nextLine();
            String yn = input.nextLine();
            yorn = yn.charAt(0);
        }while(yorn == 'y' || yorn == 'Y');

        input.close();
        
        }
}