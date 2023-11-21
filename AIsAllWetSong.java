package Tugas4;

import static java.lang.System.out;
public class AIsAllWetSong {
    public static void main(String args[]) {

        for (int verse = 1; verse <= 3; verse++) {
            out.print("AI's all wet.");
            out.println("Oh, why is AI's all wet? Oh,");
            out.print("AI's all wet 'cause ");
            out.println("he's standing in the rain.");
            out.println("Why is AI out in the rain?");

            switch (verse) {
                case 1 :
                    out.println("That's because he has no brain.");

                case 2 :
                    out.println("That's because he is a pain.");

                case 3 :
                    out.println("'Cause this is the last refrain.");
                    break;
            }

            switch (verse) {
                case 3 :
                    out.println("Last refrain, last refrain,");

                case 2 :
                    out.println("He's a pain, he's a pain");

                case 1 :
                    out.println("'Has no brain, has no brain,");
            }

            out.println("In the rain, in the rain.");
            out.println("Ohhhhhhhh...");
            out.println();
        }

        out.print("AI's all wet.");
        out.println("Oh, why is AI's all wet? Oh,");
        out.print("AI's all wet 'cause ");
        out.println("he's standing in the rain.");
    }
}
