# Intoduction 
The MatrixCalculator program is a Java console application designed to perform basic matrix operations such as addition and subtraction. The application supports matrices of integers and ensures that the operations are performed only on matrices with compatible dimensions. It provides a user-friendly interface to input the dimensions and elements of the matrices, select the desired operation, and view the result.

# Features
- Dynamic Matrix Size Input: Allows users to specify the number of rows and columns for two matrices, ensuring flexibility in handling matrices of various sizes.
- Matrix Element Input: Facilitates entry of individual elements for each matrix, offering detailed control over the matrix content.
- Matrix Operations: Supports addition and subtraction of matrices, provided they have matching dimensions, demonstrating basic linear algebra principles.
- Input Validation: Ensures that all inputs (dimensions, matrix elements, and operation choice) are valid integers, enhancing the robustness and user-friendliness of the application.
# Components
- Main Method: The main method is the entry point of the application. It handles user interactions, matrix creation, and operation selection.
- Utility Methods:
  - getValidInput(Scanner scanner): Ensures that the user inputs a valid integer, making the program more robust against invalid inputs.
  - enterMatrixElements(Scanner scanner, int[][] matrix): Collects the elements for a matrix from the user.
  - addMatrices(int[][] matrixA, int[][] matrixB): Performs matrix addition.
  - subtractMatrices(int[][] matrixA, int[][] matrixB): Performs matrix subtraction.
  - printMatrix(int[][] matrix): Displays a matrix to the console, formatting the output for readability.
# How It Works
- Input Matrix Dimensions: The user is prompted to enter the number of rows and columns for Matrix A and Matrix B. The program checks that both matrices have the same dimensions if an addition or subtraction operation is to be performed.

- Matrix Element Input: The user inputs the elements for both matrices. The program ensures that each element entered is a valid integer.

- Operation Selection: The user is asked to choose between addition and subtraction. The program checks for a valid choice and performs the corresponding operation.

- Displaying Results: The resulting matrix from the chosen operation is displayed to the user.

# Usage
To use the MatrixCalculator, compile and run the MatrixCalculator.java file. Follow the prompts to enter the dimensions and elements of the matrices, select the desired operation, and view the output.

# Conclusion
The MatrixCalculator program showcases basic concepts in Java programming such as arrays, loops, conditional statements, and exception handling. It serves as a practical example of applying these concepts to perform real-world tasks, in this case, matrix operations, making it a valuable tool for understanding and applying basic linear algebra in a programming context.