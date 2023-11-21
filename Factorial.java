package TugasSoloLearn;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int factorial = 1;
        for(int x=1; x<=number; x++){
            factorial *=x;
        }
        System.out.println(factorial);
    }
}
