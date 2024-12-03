package Rekursif;

import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        //Input User
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jmlAngka = sc26.nextInt();

        int[] angka = new int[jmlAngka];

        for (int i = jmlAngka; i >= 1; i--){
            System.out.print("Masukkan angka ke-" + (i) + ": ");
            angka[i-1] = sc26.nextInt();
        }
        //Hasil
        System.out.println("Total dari " + jmlAngka + " angka yang dimasukkan adalah (Rekursif) : " + rekursif(angka, jmlAngka));
        System.out.println("Total dari " + jmlAngka + " angka yang dimasukkan adalah (Iteratif) : " + iteratif(angka));

        sc26.close();
    }
    //Fungsi Rekursif
    public static int rekursif(int[] arr, int indeks){
        if (indeks == 0) {
            return 0;
        } else {
            return (arr[indeks - 1] + rekursif(arr, indeks - 1));
        }
    }
    //Fungsi Iteratif
    public static int iteratif(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
}
