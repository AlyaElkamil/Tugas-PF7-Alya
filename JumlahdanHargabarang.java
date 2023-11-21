package Tugas6;

import java.util.Scanner;
public class JumlahdanHargabarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah barang: ");

        int Array[] = {2500,3000,4000,5000,6000};
        int [] item = new int[Array.length];

        for (int x=0; x<Array.length; x++) {
            System.out.print("Jumlah barang ke-" + x + " Rp " + Array[x] + ":" );
            item[x] = scanner.nextInt();
        }

        System.out.println("Daftar belanja dan harga: ");
        for (int x=0; x<Array.length; x++) {
            int uang = Array[x]*item[x];
            System.out.println("Harga barang ke-" + x + " Rp " + Array[x] + ", " + item[x] + " item: " + "Rp " + uang );
        }

        int total = 0;
        for (int x = 0; x<Array.length; x++) {
            total = total + item[x];
        }

        int harga = 0;
        for (int x = 0; x<Array.length; x++) {
            harga = harga + Array[x]*item[x];
        }

        System.out.println("Total barang belanjaan : " + total);
        System.out.println("Total harga barang belanjaan: " + harga);
    }
}
