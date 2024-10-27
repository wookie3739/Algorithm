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

        //한 자리일 경우 1 1
        //두 자리일 경우 10 1
        //세 자리일 경우 101, 100 2
        //네 자리일 경우 1000, 1001, 1010 3
        //다섯 자리일 경우 10000, 10001, 10010, 10101, 10100 5
        //여섯 자리일 경우 100000, 100001, 100010, 100101, 101010, 101001, 100100, 101000 8

        long result = pinaryNumber(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static long pinaryNumber(int N){
        dp = new long[N + 1]; // 자릿수

        if(N <= 2) return 1;

        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= N; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[N];

    }
}