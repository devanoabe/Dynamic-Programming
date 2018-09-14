/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungfibonaci;
import java.util.Scanner;
public class Tugas01 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas :" + identitas);
    }
    
    public static void main(String[] args)
    {
        String identitas = "Devano Abe / X RPL 03 / 12";
        tampilJudul(identitas);
        
          System.out.println("Pecahan Uang antara lain Rp.5000, Rp.2000, Rp.1000, Rp.500, Rp.100 ");
        int uang = input();
        int[] Nominal = new int[]{5000, 2000, 1000, 500, 100};
       JumlahUang(uang, Nominal);
    }
    
    private static int input()
    {
        Scanner baca = new Scanner (System.in);
        
        System.out.print("Jumlah uang = Rp. ");
        int uang = baca.nextInt();
        
        return uang;
    }
    private static void JumlahUang(int uang , int[]Nominal)
    {
        for (int i = 0; i < Nominal.length; i++)
        {
        int n = 0;
        while(uang >= Nominal[i])
        {
            uang = uang - Nominal[i];
            n++;
        }
            System.out.println(Nominal[i] + " " + "Sebanyak" + " " + n);
        }
    }
}
