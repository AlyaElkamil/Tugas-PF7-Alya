package Tugas3;

import java.util.Scanner;
public class KodeNegaraIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kode Negara :");
        String kodeNegara = sc.nextLine();

        String namaNegara;
        if(kodeNegara.equals("ES")){
            namaNegara = "Spain";

        }else if(kodeNegara.equals("TN")){
            namaNegara = "Tunisia";

        }else if(kodeNegara.equals("ID")){
            namaNegara = "Indonesia";

        }else if(kodeNegara.equals("MM")){
            namaNegara = "Myanmar";

        }else if(kodeNegara.equals("IN")){
            namaNegara = "India";

        }else{
            System.out.println("Maaf kode negara yang anda masukkan tidak diketahui.");
            return;
        }
        System.out.println("Nama Negara = " +namaNegara);
    }
}
