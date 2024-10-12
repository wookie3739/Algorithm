import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());

        int[][] dp = new int[41][2];

        dp[0][0] = 1;  // fibonacci(0)은 0을 1번 출력
        dp[0][1] = 0;  // fibonacci(0)은 1을 0번 출력
        dp[1][0] = 0;  // fibonacci(1)은 0을 0번 출력
        dp[1][1] = 1;  // fibonacci(1)은 1을 1번 출력

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];  // 0이 출력되는 횟수
            dp[i][1] = dp[i-1][1] + dp[i-2][1];  // 1이 출력되는 횟수
        }

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            bw.write(dp[N][0] + " " + dp[N][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
