import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // DP로 가장 긴 증가하는 부분 수열의 길이를 계산
        int result = LIS(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int LIS(int N) {
        // 각 위치에서 자기 자신만을 포함하는 수열은 길이 1이므로 dp 배열을 1로 초기화
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        // LIS 알고리즘 적용
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // dp 배열에서 가장 큰 값이 가장 긴 증가하는 부분 수열의 길이
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
