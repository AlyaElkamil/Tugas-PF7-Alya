package Tugas6;

import java.util.Scanner;
public class GenapdanGanjil {
    public static void main(String[] args) {
        int[] dataArray = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 6 data:");

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("Data ke-" + (i + 0) + ": ");
            dataArray[i] = scanner.nextInt();
        }
        System.out.println("Data dan Jenis:");

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");

            if (dataArray[i] % 2 == 0) {
                System.out.println("(Genap)");
            } else {
                System.out.println("(Ganjil)");
            }
        }
        int total = 0;

        for (int data : dataArray) {
            total += data;
        }

        double rataRata = (double) total / dataArray.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
