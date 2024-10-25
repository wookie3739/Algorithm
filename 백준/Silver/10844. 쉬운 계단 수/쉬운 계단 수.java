import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static final int MOD = 1_000_000_000; // 결과값을 나눌 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // dp[i][j] : 길이가 i이고 마지막 자리가 j인 계단 수의 개수
        int[][] dp = new int[N + 1][10];

        // 초기값 설정: 길이가 1일 때, 1부터 9까지는 각각 계단 수로 간주
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // DP 테이블 채우기
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1]; // 0으로 끝나는 경우는 이전 자리가 1이어야 함
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][8]; // 9로 끝나는 경우는 이전 자리가 8이어야 함
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }

        // 길이가 N인 계단 수의 개수 합산
        int result = 0;
        for (int j = 0; j <= 9; j++) {
            result = (result + dp[N][j]) % MOD;
        }

        // 결과 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}