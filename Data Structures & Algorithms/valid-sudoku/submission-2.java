class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> r = new HashMap<>();
        Map<Integer, Set<Character>> c = new HashMap<>();
        Map<String, Set<Character>> sq = new HashMap<>();

        for(int i = 0; i < 9; i++){
            for(int b = 0; b < 9; b++){
                if(board[i][b] == '.')continue;

                String sKey = (i/3)+","+(b/3);

                if(r.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][b]) ||
                c.computeIfAbsent(b, k -> new HashSet<>()).contains(board[i][b]) ||
                sq.computeIfAbsent(sKey, k -> new HashSet<>()).contains(board[i][b])
                ){
                    return false;
                }

                r.get(i).add(board[i][b]);
                c.get(b).add(board[i][b]);
                sq.get(sKey).add(board[i][b]);
            }
        }
        return true;
    }
}
