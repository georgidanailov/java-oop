package abstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimensions = readPositions(scanner.nextLine());
            int rows = dimensions[0]; //number of rows
            int cols = dimensions[1]; //number of cols

            int[][] matrix = new int[rows][cols]; //field

        fillFields(rows, cols, matrix); //filling the field

            String command = scanner.nextLine();
            long sum = 0; //total amount of stars
            while (!command.equals("Let the Force be with you"))
            {
                //EVIL
                int[] evilPositions = readPositions(scanner.nextLine()); //[3, 4] -> row and col of evilJedi
                int rowEvil = evilPositions[0]; //row of evilJedi
                int colEvil = evilPositions[1]; //col of evilJedi
                //movement of evilJedi
                moveEvil(matrix, rowEvil, colEvil);

                //JEDI
                int[] jediPositions = readPositions(command); //[4, 5] -> row and col of Jedi
                int rowJedi = jediPositions[0]; //row of the Jedi
                int colJedi = jediPositions[1]; //col of the Jedi
                //movement and addition of stars for Jedi
                int collectStars = (int) getCollectedStars(matrix, rowJedi, colJedi);
                sum += collectStars;

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static long getCollectedStars(int[][] matrix, int rowJedi, int colJedi) {
        int countStars = 0;
        while (rowJedi >= 0 && colJedi < matrix[1].length)
        {
            if (rowJedi < matrix.length && colJedi >= 0 && colJedi < matrix[0].length)
            {
                countStars += matrix[rowJedi][colJedi];
            }

            colJedi++;
            rowJedi--;
        }
        return countStars;
    }

    private static void moveEvil(int[][] matrix, int rowEvil, int colEvil) {
        while (rowEvil >= 0 && colEvil >= 0)
        {
            if (rowEvil >= 0 && rowEvil < matrix.length && colEvil >= 0 && colEvil < matrix[0].length)
            {
                matrix[rowEvil] [colEvil] = 0;
            }
            rowEvil--;
            colEvil--;
        }
    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillFields(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                matrix[row][col] = value++;
            }
        }
    }
}
