import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of Sources and Destinations.");
        int numSource = in.nextInt();
        int numDestination = in.nextInt();

        int[][] question = new int[numSource][numDestination];
        int[][] supply = new int[numSource][1];
        int[][] demand = new int[1][numDestination];

        // Takes input values of the X[i][j] elements.
        for(int i = 0; i < numSource ; i++) {
            for(int j = 0; j < numDestination; j++) {
                System.out.print("Enter X[" + (i + 1) + "][" + (j + 1) + "]: ");
                question[i][j] = in.nextInt();
            }
        }

        // Takes input values of the demand and supply row and column.
        for(int i = 0; i < numSource; i++) {
            System.out.println("Enter Supply from S" + (i + 1) +": ");
            supply[i][0] = in.nextInt();
        }
        
        for(int i = 0; i < numDestination; i++) {
            System.out.println("Enter Demand from D" + (i + 1) +": ");
            demand[0][i] = in.nextInt();
        }

        for(int i = 0; i < (numSource + 1); i++) {
            for(int j = 0; j < (numDestination + 1); j++) {
                if(j == numDestination) {
                    continue;
                }
                System.out.print(question[i][j] + "\t");
            }
            if(i == numSource) {
                continue;
            }
            System.out.println("");
        }
    }
}
