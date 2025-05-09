/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:

    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.

 */

//STEPS:
//1. Every single row does not have a duplicate - HashSet
//2. Every single column does not have a duplic - HashSet

//3. Every 9x9 does not have a duplicate
// 3a. Organize subboxes 1-3, 4-6, 7-9 into a boxIndex of [1-3]





class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 3 Trackers
        boolean[][] rows = new boolean [9][9];
        boolean[][] columns = new boolean [9][9];
        boolean[][] subBoxes = new boolean [9][9];

    }
}


//Lesson:
    boolean[][] matrix = new boolean[outter][inner];
    boolean[][] matrix = new boolean[rows][columns];

    //visual: boolean[][] rows = new boolean [9][9];
        [
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false],
        [false, false, false, false, false, false, false, false, false]

        ]

