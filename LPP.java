import java.util.*;

public class LPP {
    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        transportation();
    }

    static void typeOfQuestion() {
        System.out.println("Enter '1' if it is a simplex question or '2' if it is an transportation question.");
        int userInput = in.nextInt();
    }

    static void transportation() {
        System.out.println("Enter number of Sources and Destinations.");
        int numSource = in.nextInt();
        int numDestination = in.nextInt();

        int[][] question = new int[numSource + 1][numDestination + 1];

        for(int i = 0; i < numSource; i++) {
            for(int j = 0; j < numDestination; j++) {
                System.out.print("Enter x[" + (i + 1) + "][" + (j + 1) + "]: ");
                question[i][j] = in.nextInt();
            }
        }

        System.out.println("Question:");
        for(int i = 0; i < numSource; i++) {
            for(int j = 0; j < numDestination; j++) {
                if(j == 0) {
                    System.out.print("S ");
                }
                System.out.print(question[i][j] + " ");
            }
            System.out.println();
        }
    }
}