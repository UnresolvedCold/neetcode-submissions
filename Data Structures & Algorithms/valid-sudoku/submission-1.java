class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkHorizontal(board) && checkVertical(board) && checkCells(board);
    }

    private boolean checkHorizontal(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> hset = new HashSet<Character>(9);

            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (hset.contains(board[i][j])) return false;
                hset.add(board[i][j]);
            }
        }

        return true;
    }

    private boolean checkVertical(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> hset = new HashSet<Character>(9);

            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (hset.contains(board[j][i])) return false;
                hset.add(board[j][i]);
            }
        }

        return true;
    }

    private boolean checkCells(char[][] board) {
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBox(board, i, j)) return false;
            }
        }

        return true;
    }

    private boolean checkBox(char[][] board, int a, int b) {
        Set<Character> hset = new HashSet<Character>(9);

        for (int i=a; i<a+3; i++) {
            for (int j=b; j<b+3; j++) {
                if (board[i][j] == '.') continue;
                if (hset.contains(board[i][j])) return false;
                hset.add(board[i][j]);
            }
        }

        return true;
    }
}
