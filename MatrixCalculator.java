import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = getValidInput(scanner);
        System.out.print("Enter the number of columns for Matrix A: ");
        int columnsA = getValidInput(scanner);

        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = getValidInput(scanner);
        System.out.print("Enter the number of columns for Matrix B: ");
        int columnsB = getValidInput(scanner);

        if (rowsA != rowsB || columnsA != columnsB) {
            System.out.println("Matrix addition and subtraction require matrices of the same dimensions.");
            return;
        }

        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[rowsB][columnsB];

        System.out.println("Enter elements of Matrix A:");
        enterMatrixElements(scanner, matrixA);

        System.out.println("Enter elements of Matrix B:");
        enterMatrixElements(scanner, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        int choice = getValidInput(scanner);

        switch (choice) {
            case 1:
                System.out.println("Result of Matrix Addition:");
                int[][] resultAddition = addMatrices(matrixA, matrixB);
                printMatrix(resultAddition);
                break;
            case 2:
                System.out.println("Result of Matrix Subtraction:");
                int[][] resultSubtraction = subtractMatrices(matrixA, matrixB);
                printMatrix(resultSubtraction);
                break;
            default:
                System.out.println("Invalid choice. Please select 1 for addition or 2 for subtraction.");
                break;
        }
    }

    private static int getValidInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return input;
    }

    private static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = getValidInput(scanner);
            }
        }
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    private static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
