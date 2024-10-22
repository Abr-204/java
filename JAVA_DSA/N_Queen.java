import java.util.ArrayList;
import java.util.List;
class N_Queen {
    public boolean isSafe(int row,int col,char[][] board){
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q') return false;
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q') return false;
        }
        r=row;
        for(int c=col;r>=0 && c<board.length;r--,c++){
            if(board[r][c]=='Q') return false;
        }
        r=row;
        for(int c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q') return false;
        }
        r=row;
        for(int c=col;r<board.length && c<board.length;r++,c++){
            if(board[r][c]=='Q') return false;
        }
        return true;
    }
    public void saveBoard(char[][] board,List< List<String>> Boards){
        String row="";
        List<String>newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                    row+='Q';
                else row+='.';
            }
            newBoard.add(row);
        }
        Boards.add(newBoard);
    }
    public void helper(List< List<String>> Boards,char[][] board,int col){
        if(col==board.length){
            saveBoard(board,Boards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(Boards,board,col+1);
                board[row][col]='.';
            }
        }

    }
    public List<List<String>> N_Queen(int n) {
        List< List<String>> Boards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(Boards,board,0);
        return Boards;

    }
}
