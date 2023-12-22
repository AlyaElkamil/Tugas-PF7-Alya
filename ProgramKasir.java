package Latihan;
import java.util.Scanner;

public class ProgramKasir {
    public String namaBarang;
    public int harga;
    public int jumlah;
    public int pembayaran;
    public int total;

    public String getNamaBarang(){
        return namaBarang;
    }
    public void setNamaBarang(String newNamaBarang) {
        this.namaBarang = newNamaBarang;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int newHarga) {
        this.harga = newHarga;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int newJumlah) {
        this.jumlah = newJumlah;
    }
    public int getPembayaran(){
        return pembayaran;
    }
    public void setPembayaran(int newPembayaran) {
        this.pembayaran = newPembayaran;
    }
    public int getTotal(){
        return total;
    }
    public void setTotal(int newTotal) {
        this.total = newTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Barang: ");
        String namaBarang = sc.nextLine();
        System.out.println("Harga Barang: ");
        int harga = sc.nextInt();
        System.out.println("Jumlah Barang: ");
        int jumlah = sc.nextInt();
        System.out.println("Pembayaran: ");
        int pembayaran = sc.nextInt();
        System.out.println("Total: ");
        int total = sc.nextInt();
    }
}
