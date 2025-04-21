/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author user
 */

import java.util.Arrays;

import java.util.Arrays;

public class Game {
  static   String [][]newArraytoCheck;
    // Generate Sudoku-like grid
    public String[][] generateSudoku(int size, int level) {
        String[][] grid = new String[size][size];
        newArraytoCheck=new String[grid.length][grid.length];
        // Step 1: Initialize with blank strings
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                grid[i][j] = "";
                newArraytoCheck[i][j]="";
            }
        }

        // Step 2: Fill the grid
        int[] baseRow = new int[size];
        for (int i = 0; i < size; i++)
            baseRow[i] = i + 1;

        // Shuffle baseRow
        shuffleArray(baseRow);

        // Fill rows by rotating baseRow
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int value = baseRow[(col + row) % size];
                grid[row][col] = Integer.toString(value);
                newArraytoCheck[row][col]=grid[row][col];
            }
        }

        // Step 3: Remove 10% of elements randomly
        System.out.println("100");
        int totalToRemove = (int)Math.floor((int)(size * size * 0.1 * level));
        System.out.println(totalToRemove + " totalToRemove");
        //System.out.print(totalToRemove);
        removeRandomElements(grid, totalToRemove);

        return grid;
    }

    // Shuffle array
    public void shuffleArray(int[] array) {
        //Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = getRandom(i + 1);
            // Swap
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Remove elements randomly
    public void removeRandomElements(String[][] grid, int toRemove) {
        //Random rand = new Random();
        int size = grid.length;
        int removed = 0;

        while (removed < toRemove) {
            int i = getRandom(size);
            System.out.println("i " + i);
            int j = getRandom(size);
            System.out.println("j " + j);

            if (!grid[i][j].equals("")) {
                grid[i][j] = "";
                removed++;
            }
        }
        System.out.println("Yes");
    }

    private int getRandom(int num){
        long seed = System.nanoTime();
        return  Math.abs((int)seed % num);
    }

    public static void main(String[] args) {
        Game a=new Game();
       String [][]b= a.generateSudoku(13,4);
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(newArraytoCheck));
    }
}
