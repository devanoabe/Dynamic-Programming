/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungfibonaci;
import java.util.Scanner;
public class Tugas2 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
    }
    
    public static void main(String[] args)
    {
        String identitas = "Devano Abe / X RPL 03 / 12";
        
        tampilJudul(identitas);
        
        tampilJudul(identitas);
        System.out.println("7KG = Rp. 10.000");
        System.out.println("5Kg = Rp. 7.000");
        System.out.println("4Kg = Rp. 5.000");
        System.out.println("3Kg = Rp. 3.000");
        System.out.println("2Kg = Rp. 2.000");
        int[] Berat = new int[]{7, 5, 4, 3, 2};
        int[] Harga = new int[]{10000, 7000, 5000, 3000, 2000};
        
        int berat = input();
        
       Proses(berat, Berat, Harga);
    }
    private static int input()
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Berat Barang : ");
        int berat = baca.nextInt();
        System.out.println();
        return berat;
        
    }
         private static void Proses(int berat, int[]Berat, int[]Harga)
    {
        int jumlah = 0;
        for(int i=0; i < Berat.length; i++)
        {
            int n = 0;
            while(berat >= Berat[i])
            {
                berat = berat - Berat[i];
                n++;
            }
            
            int total = n*Harga[i];
            System.out.println(Berat[i] + "Kg"  + " " + "Sebanyak" + " " + n + " " + "dengan total harga Rp. " + total);
            jumlah = jumlah + total;
        }
        
        System.out.println("\nTotal Bayaran Rp. " + jumlah);
    }
    }
    

