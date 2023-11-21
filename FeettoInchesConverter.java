package TugasSoloLearn;

import java.util.Scanner;
public class FeettoInchesConverter {
    static double convert(double feet) {
        double inches = feet * 12.0;
        System.out.println(inches);
        return inches;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
}
