package Quiz;

public class TugasQuiz {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 51;
        int d = 50;
        int e = 60;
        int totalNilai = a + b + c + d + e;
        double mean = totalNilai / 5;

        System.out.println("Jumlah Total Nilai = " + totalNilai);
        System.out.println("Rata-rata Nilai = " + mean);
    }
}
