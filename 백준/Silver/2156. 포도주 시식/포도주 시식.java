import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];  // 포도주 양을 저장할 배열
        dp = new int[n + 1];   // DP 배열

        // 포도주 양 입력 받기
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = choose(n);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int choose(int n) {
        // 포도주 잔이 하나일 경우
        if (n == 1) return arr[1];

        // DP 초기값 설정
        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        // DP 테이블 채우기
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }

        return dp[n];  // 마지막 잔까지의 최대값 반환
    }
}
