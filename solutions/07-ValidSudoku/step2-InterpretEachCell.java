class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean [9][9];
        boolean[][] columns = new boolean [9][9];
        boolean[][] subBoxes = new boolean [9][9];

    }
}

// each cell in the board is a CHAR (ASCII).

//convert char to array index:
int num = board[i][j] - '1';

// ASCII LOGIC:
    '5' -> ASCII 53
    '1' -> ASCII 49
        '5' - '1' -> 53 - 49 = 4
    // character 5 -> index 4

//what is solves:
    //Track digits: 1-9
    //boolean[][] are indexed: 0-8
        '1' -> 0
        '2' -> 1
        ...
        '9' -> 8