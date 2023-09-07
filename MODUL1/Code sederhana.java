package MODUL1;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        float a = scanner.nextFloat();

        System.out.print("Masukkan angka kedua: ");
        float b = scanner.nextFloat();

        float perkalian = a * b;
        float pembagian = a / b;
        float penjumlahan = a + b;
        float pengurangan = a - b;

        System.out.println("Hasil perkalian: " + perkalian);
        System.out.println("Hasil pembagian : " + pembagian);
        System.out.println("Hasil penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan : " + pengurangan);
    }
}
