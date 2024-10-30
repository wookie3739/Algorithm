import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    // 메모이제이션 배열
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long result = tile(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static long tile(int n){

        dp = new long[n + 1];

        // 길이 1과 2에 대한 초기값 설정
        if(n == 1) return 1;
        if(n == 2) return 2;

        dp[1] = 1;
        dp[2] = 2;

        // 점화식을 이용해 dp 배열 채우기
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
        }

        return dp[n];
    }
}
