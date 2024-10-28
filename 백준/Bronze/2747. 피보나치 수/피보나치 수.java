import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long result = fibonacci(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static long fibonacci(int n){
        dp = new long[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }
}
