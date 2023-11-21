package Tugas5;

import java.util.Scanner;
public class TebakPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 4516;
        int maxAttempts = 3;
        int attempts = 0;

        System.out.println("Selamat datang! Masukkan PIN 4 digit Anda:");

        while (attempts < maxAttempts) {
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                System.out.println("PIN benar. Akses diberikan.");
                break;
            } else {
                attempts++;
                System.out.println("PIN salah. Percobaan ke-" + attempts + " dari " + maxAttempts);
                if (attempts < maxAttempts) {
                    System.out.println("Masukkan PIN lagi:");
                }
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Percobaan akses PIN melebihi batas. Akses ditolak.");
        }

        scanner.close();
    }
}
