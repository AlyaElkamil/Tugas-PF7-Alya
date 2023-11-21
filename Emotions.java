package TugasMandiri;

import java.util.Scanner;
public class Emotions {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input emotions's code: ");
            String Emotionscode = sc.nextLine();

            String Emotions;
            switch(Emotionscode) {
                case "J":
                    Emotions = "Joy";
                    break;

                case "M":
                    Emotions = "Mad";
                    break;

                case "D":
                    Emotions = "Disgust";
                    break;

                case "L":
                    Emotions = "Lust";
                    break;

                case "S":
                    Emotions = "Sad";
                    break;
                default:

                    System.out.println("I'm sorry, i couldn't identify that.");
                    return;
               }
            System.out.println("The emotion is = " +Emotions);
        }
}
