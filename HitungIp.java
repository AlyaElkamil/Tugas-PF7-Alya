package Tugas1;

public class HitungIp {
    public static void main(String[] abc) {
        int sksPF = 4;
        int sksKalkulus = 3;
        int sksSistemDigital = 2;
        double nilaiIndexPF = 3.5;
        double nilaiIndexKalkulus = 4.0;
        double nilaiIndexSisdig = 2.75;
        double totalIndex = (sksPF * nilaiIndexPF) + (sksKalkulus * nilaiIndexKalkulus) + (sksSistemDigital * nilaiIndexSisdig);
        int totalSks = sksKalkulus + sksPF + sksSistemDigital;
        double ip = totalIndex / totalSks;

        System.out.println ("Ip Kamu Adalah" + ip);
    }
}
