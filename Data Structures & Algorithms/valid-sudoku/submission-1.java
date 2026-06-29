class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int digit = board[r][c] - '1';
                int bit = 1 << digit;
                int boxIdx = (r / 3) * 3 + (c / 3);

                if ((rows[r] & bit) != 0) return false;
                if ((cols[c] & bit) != 0) return false;
                if ((boxes[boxIdx] & bit) != 0) return false;

                rows[r] |= bit;
                cols[c] |= bit;
                boxes[boxIdx] |= bit;

            }
        }
        return true;
    }
}
