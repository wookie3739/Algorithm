import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수
        
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());  // 스티커 열의 개수
            
            int[][] sticker = new int[2][n];  // 스티커 점수 배열
            int[][] dp = new int[2][n];  // DP 배열
            
            // 스티커 점수 입력
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            // 초기값 설정
            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];
            
            if (n > 1) {
                dp[0][1] = dp[1][0] + sticker[0][1];
                dp[1][1] = dp[0][0] + sticker[1][1];
            }
            
            // 점화식 적용
            for (int i = 2; i < n; i++) {
                dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + sticker[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + sticker[1][i];
            }
            
            // 결과값 구하기
            int result = Math.max(dp[0][n - 1], dp[1][n - 1]);
            bw.write(result + "\n");  // 결과를 버퍼에 추가
        }
        
        bw.flush();  // 버퍼에 담긴 내용을 출력
        bw.close();
        br.close();
    }
}
