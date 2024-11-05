import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int MOD = 10007;
        
        int[][] dp = new int[N + 1][10];
        
        // 초기값 설정: 길이가 1인 오르막 수
        for (int j = 0; j <= 9; j++) {
            dp[1][j] = 1;
        }
        
        for (int i = 2; i <= N; i++) { // 수의 길이 2부터 N까지 반복
            for (int j = 0; j <= 9; j++) {
                dp[i][j] = 0; // 초기화
                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][k]) % MOD;
                }
            }
        }  
        // 길이가 N인 모든 오르막 수의 개수를 구함
        int result = 0;
        for (int j = 0; j <= 9; j++) {
            result = (result + dp[N][j]) % MOD;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
