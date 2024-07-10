import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//체스판 다시 칠하기
public class Main {
    
    public static int minCount(int startRow, int startCol, String[] board){
        String[] orgBoard = {"WBWBWBWB","BWBWBWBW"};

        int whiteSol = 0;
        for(int i = 0; i < 8; i++){
            int row = startRow + i;
            for(int j = 0; j < 8; j++){
                int col = startCol + j;
                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)){
                    whiteSol++;
                }
            }
        }
        return Math.min(whiteSol, 64 - whiteSol);
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        String[] board = new String[N];

        for(int i = 0; i < N; i++){
            board[i] = br.readLine().trim();
        }
        //최소 비교
        int maxValue = Integer.MAX_VALUE;
        // 체스판 8 * 8이 몇 개인지 구함.
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){
              int min = minCount(i, j, board);

              if(min < maxValue){
                maxValue = min;
              }
            }
        }

        bw.write(Integer.toString(maxValue));
        

        bw.close();
        br.close();
    }
}
