import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 동전2_2294
public class Main {
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); 

        arr = new int[n + 1];
        dp = new int[k + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // dp 배열을 큰 값으로 초기화 (최소값을 찾기 위해)
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // 0원을 만들기 위한 동전 개수는 0

        for (int i = 1; i <= n; i++) {
            for (int j = arr[i]; j <= k; j++) {
                if (dp[j - arr[i]] != Integer.MAX_VALUE) { // 이전 값이 유효한 경우
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
            }
        }
        int result = dp[k] == Integer.MAX_VALUE ? -1 : dp[k];
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
