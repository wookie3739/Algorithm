import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){

            int N = Integer.parseInt(br.readLine());

            long result = triangle(N);

            sb.append(result).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static long triangle(int n){

        if(n == 1 || n == 2 || n == 3) return 1;

        long[] dp = new long[n + 1];

        dp[1] = dp[2] = dp[3] = 1;

        for(int i = 4; i <= n; i++){
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
