import java.util.Arrays;
import java.util.Scanner;

public class SudokoVersion2 {
    static String[][] sudokuGrid;
    static String[][] solutionGrid;
    static String[][] playerGrid;
    static int digitLength;
    static int gridSize;
    static int emptyCellCount;

    static String[][] initializeGrid(int gridSize) {
        String sizeString = Integer.toString(gridSize);
        digitLength = sizeString.length();

        sudokuGrid = new String[2 * gridSize + 1][2 * gridSize + 1];
        playerGrid = new String[2 * gridSize + 1][2 * gridSize + 1];
        solutionGrid = new String[2 * gridSize + 1][2 * gridSize + 1];

        for (int i = 0; i < sudokuGrid.length; i++) {
            Arrays.fill(sudokuGrid[i], "0");
        }

        String horizontalDivider = "_".repeat(digitLength);
        String blankSpace = " ".repeat(digitLength);

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                if (i % 2 == 0) {
                    sudokuGrid[i][j] = (j % 2 == 0) ? "." : horizontalDivider;
                } else {
                    sudokuGrid[i][j] = (j % 2 == 0) ? "|" : blankSpace;
                }
            }
        }

        fillGridValues(sudokuGrid, gridSize);

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                solutionGrid[i][j] = sudokuGrid[i][j];
            }
        }

        clearRandomCells(sudokuGrid, gridSize);

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                playerGrid[i][j] = sudokuGrid[i][j];
            }
        }

        return sudokuGrid;
    }

    static void fillGridValues(String[][] grid, int gridSize) {
        String sizeString = Integer.toString(gridSize);
        int tempValue;
        int startValue = (int) (System.nanoTime() % gridSize + 1);

        for (int i = 1; i < 2 * gridSize + 1; i += 2) {
            tempValue = startValue;
            for (int j = 1; j < 2 * gridSize + 1; j += 2) {
                grid[i][j] = String.format("%" + digitLength + "d", startValue);
                startValue = startValue % gridSize + 1;
            }
            startValue = tempValue % gridSize + 1;
        }
    }

    static void clearRandomCells(String[][] grid, int gridSize) {
        int clearedCount = 0;
        int row, column;

        while (clearedCount < (gridSize * gridSize) / 3) {
            row = (int) (System.nanoTime() % (2 * gridSize + 1));
            column = (int) (System.nanoTime() % (2 * gridSize + 1));

            if (row % 2 == 0 || column % 2 == 0) {
                continue;
            }

            if (!grid[row][column].isBlank()) {
                grid[row][column] = " ".repeat(digitLength);
                clearedCount++;
            }
        }
    }

    static void placeNumber(int row, int column, int value) {
        row--;
        column--;

        if (playerGrid[2 * row + 1][2 * column + 1].equals(" ".repeat(digitLength))) {
            playerGrid[2 * row + 1][2 * column + 1] = String.format("%" + digitLength + "d", value);
            emptyCellCount--;
        } else {
            System.out.println("Cell is already filled.");
        }

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                System.out.print(playerGrid[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a valid grid size in the command-line arguments.");
            return;
        }

        gridSize = Integer.parseInt(args[0]);

        if (gridSize < 0) {
            System.out.println("Grid size must be a positive integer.");
            return;
        }

        emptyCellCount = 0;
        String[][] generatedGrid = initializeGrid(gridSize);

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                if (generatedGrid[i][j].trim().isEmpty()) {
                    emptyCellCount++;
                }
            }
        }

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                System.out.print(generatedGrid[i][j]);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        while (emptyCellCount > 0) {
            System.out.println("Enter row number:");
            int row = scanner.nextInt();
            System.out.println("Enter column number:");
            int column = scanner.nextInt();
            System.out.println("Enter the number to place:");
            int number = scanner.nextInt();

            placeNumber(row, column, number);

            System.out.println("-".repeat(45));

        }

        boolean isCorrect = true;

        for (int i = 0; i < 2 * gridSize + 1; i++) {
            for (int j = 0; j < 2 * gridSize + 1; j++) {
                if (!solutionGrid[i][j].equals(playerGrid[i][j])) {
                    System.out.println("There seems to be a mistake. Better luck next time!");
                    isCorrect = false;
                    break;
                }
            }
        }

        if (isCorrect) {
            System.out.println("Congratulations! You completed the Sudoku correctly.");
        }

        System.out.println("Thank you for playing!");
    }
}