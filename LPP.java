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

        numSource++;
        numDestination++;

        int[][] question = new int[numSource][numDestination];

        // Takes input values of the X[i][j] elements.
        for(int i = 0; i < numSource - 1; i++) {
            for(int j = 0; j < numDestination - 1; j++) {
                System.out.print("Enter X[" + (i + 1) + "][" + (j + 1) + "]: ");
                question[i][j] = in.nextInt();
            }
        }

        // Takes input values of the demand and supply row and column.
        for(int i = 0; i < numSource - 1; i++) {
            System.out.println("Enter Supply from S" + (i + 1) +": ");
            question[i][numDestination - 1] = in.nextInt();
        }
        
        for(int i = 0; i < numDestination - 1; i++) {
            System.out.println("Enter Demand from D" + (i + 1) +": ");
            question[numSource - 1][i] = in.nextInt();
        }

        // Prints out the question
        System.out.println("Question:");
        for(int i = 0; i < numDestination + 1; i++) {
            if(i == 0) {
                System.out.print("\t");
                continue;
            }
            if(i == numDestination) {
                System.out.print("Supply" + "\t");
            } 
            else {
                System.out.print("D" + i + "\t");
            }
        }
        System.out.println();
        for(int i = 0; i < numSource; i++) {
            for(int j = 0; j < numDestination; j++) {
                if(i == numSource - 1 && j == 0) {
                    System.out.print("Demand" + "\t" + question[i][j] + "\t");
                    continue;
                }
                if(j == 0) {
                    System.out.print("S" + (i + 1) + "\t");
                }
                if(j == numDestination - 1 && i == numSource - 1) {
                    continue;
                }
                System.out.print(question[i][j] + "\t");
            }
            System.out.println();
        }
    }
}