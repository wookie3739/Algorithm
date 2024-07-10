import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> st = new Stack<>();

        for(int move : moves){
            move -= 1;

            for(int i = 0; i < board.length; i++){
                if(board[i][move] != 0){
                    
                    if(st.size() > 0 && board[i][move] == st.peek()){
                        st.pop();
                        answer += 2;
                    }else{
                        st.push(board[i][move]);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }


        return answer;
    }
}