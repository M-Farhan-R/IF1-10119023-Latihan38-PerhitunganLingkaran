/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan38.lingkaran;

/**
 *
 * @author Muhammad Farhan R 
 */
import java.util.Scanner;
public class Lingkaran {
    private final double PHi = 3.14159265358979; //笑った
    private int r;
    public int diameter;
    
    public void inputDiameter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        
        if (!scan.hasNextInt()){
            while(!scan.hasNextInt()){
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();
                System.out.print("Masukkan nilai diameter lingkaran : ");
                scan.next();
            }
        }
        diameter = scan.nextInt();
    }
    
    private void jariJariLingkaran(){
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran\t = %10d%n",r);
    }
    
    private double luasLingkaran(){
        double luas = (double)PHi * r * r;
        System.out.printf("Luas Lingkaran\t\t = %12.2f%n",luas);
        return luas;
    }
    
    private double kelilingLingkaran(){
        double keliling = (double)2*PHi*r;
        System.out.printf("Keliling Lingkaran\t = %12.2f%n",keliling);
        return keliling;
    }
    
    public void hitungLingkaran(){
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        jariJariLingkaran();
        luasLingkaran();
        kelilingLingkaran();
    }
}
