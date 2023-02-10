import java.util.Scanner;

public class DeterminantRunner
{

    public static void main(String[] args)
    {
        Scanner keyReader = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");

        int N = keyReader.nextInt();

        if (N<1)
            throw new RuntimeException("Error. Enter a positive integer.");

        int[][] matrix = generateMatrix(N);

        System.out.println("Matrix:");
        for (int[] row: matrix)
        {
            for (int x: row)
                System.out.printf("%4d ",x);
            System.out.println("");
        }

        System.out.println("Copy and paste this into Wolfram Alpha:");
        System.out.print("determinant of {");
        for (int r = 0; r<N; r++)
        {
            System.out.print("{");
            for (int c=0; c<N; c++)
            {
                System.out.print(matrix[r][c]);
                if (c<N-1)
                    System.out.print(",");
            }
            System.out.print("}");
            if (r<N-1)
                System.out.print(",");
        }
        System.out.println("}");

        System.out.print("I calculate the determinant to be: ");
        System.out.println(getDeterminant(matrix));
    }

    /**
     * Builds an n x n 2-d array with random integers in the range [-100,100)
     * @param n size of the array
     * @return a 2-d array of integers
     */
    public static int[][] generateMatrix(int n)
    {
        int[][] result = new int[n][n];
        for (int r=0; r<n; r++)
            for (int c=0; c<n; c++)
                result[r][c] = (int)(Math.random()*200-100);
        return result;
    }

    /**
     * recursive method to find the determinant of the given square matrix of integers
     * @param matrix - an n x n 2-d array of integers
     * @return the determinant of this matrix
     */
    public static int getDeterminant(int[][] matrix)
    {
        //TODO: you write this...

        return 0;
    }

    /**
     * Given an n x n 2-d array of integers, generates a n-1 x n-1 2-d array of integers by omitting the given row and
     * column
     * @param source the 2-d array of integers
     * @param rowToRemove the index of the row to omit
     * @param colToRemove the index of the column to omit
     * @return a 2-d array of integers, based on source, without one row and column
     */
    public static int[][] reduceMatrix(int[][] source, int rowToRemove, int colToRemove)
    {
        //TODO: (optional, but highly recommended.) You write this.
        return null; // dummy code. replace this!
    }

}
