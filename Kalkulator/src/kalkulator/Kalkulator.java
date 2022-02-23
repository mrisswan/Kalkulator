/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
public class Kalkulator {


    public static void main(String[] args) {
        
        int angka1,angka2,total;
        
     Scanner Input = new Scanner(System.in);
     
     System.out.println("Kalkulator Sederhana");
     String[] operator = {"Penjumlahan","Pengurangan","Perkalian","Pembagian","Modulus"};
        for (int i = 0; i<operator.length; i++){
            System.out.println(i +"."+operator[i]);
        }
        System.out.print("Masukan Operator Yang Dipilih = ");
        int operasi = Input.nextInt();
        
        System.out.print("Masukan Angka Ke-1 = ");
        angka1 = Input.nextInt();
        System.out.print("Masukan angka Ke-2 = ");
        angka2 = Input.nextInt();
        
        switch(operasi){
            case 0:
                System.out.println( + angka1 + " + " + angka2 );
                System.out.print("Hasil = ");
                total = angka1 + angka2;
                System.out.println(total);
                break;
            case 1:
                System.out.println( + angka1 + " - " + angka2 );
                System.out.print("Hasil = ");
                total = angka1 - angka2;
                System.out.println(total);
                break;
            case 2:
                System.out.println( + angka1 + " x " + angka2 );
                System.out.print("Hasil = ");
                total = angka1 * angka2;
                System.out.println(total);
                break;
            case 3:
                System.out.println( + angka1 + " : " + angka2);
                System.out.print("Hasil = ");
                total = angka1 / angka2;
                System.out.println(total);
                break;
            case 4:
                System.out.println( + angka1 + " % " + angka2);
                System.out.print("Hasil = ");
                total = angka1 % angka2;
                System.out.println(total);
                break;
            default:
                System.out.println("Operator tidak tersedia");
        }
    }
}