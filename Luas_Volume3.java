package com.tutorial;

import java.util.Scanner; 

public class Luas_Volume3 {
    public static void main(String[] args) {
        final double Phi = 3.14;
        char yorn = 'n';

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BANGUN RUANG");
            System.out.println("Choose : 1. Tabung ? ");
            System.out.println("Choose : 2. Kubus ? ");
            System.out.println("Choose : 3. Balok ? ");
            System.out.println("Chosee : 4. DONE");
            int c = input.nextShort();
        
            // Luas Permukaan & Volume Tabung
            if (c == 1) {
                System.out.println("Jari-jari alas : ");
                double r = input.nextDouble();

                System.out.println("Tinggi tabung: ");
                double t = input.nextDouble();

                double luasTabung = 2 * (Phi * r * r) + (2 * Phi * r * t);
                System.out.println("Luas Tabung = " + luasTabung);

                double volTabung = (Phi * r * r) * t;
                System.out.println("Volume Tabung = " + volTabung);
            }
            
            // Luas Permukaan & Volume Kubus 
            else if (c == 2) {
                
                System.out.println("Sisi kubus : ");
                double s = input.nextDouble();

                double luasKubus = 6 * (s * s);
                System.out.println("Luas Kubus = " + luasKubus);

                double volKubus = s * s * s;
                System.out.println("Volume Kubus = " + volKubus);
            }
            
            // Luas Permukaan & Volume Balok 
            else if (c == 3) {
                
                System.out.println("Panjang Balok : ");
                double p = input.nextDouble();
                
                System.out.println("Lebar Balok : ");
                double l = input.nextDouble();

                System.out.println("Tinggi Balok : ");
                double t = input.nextDouble();

                double luasBalok = 2 * (p * l + p * t + l * t);
                System.out.println("Luas Balok = " + luasBalok);

                double volBalok = p * l * t;
                System.out.println("Volume Kubus = " + volBalok);
            }

            // DONE
            else if (c == 4) {
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