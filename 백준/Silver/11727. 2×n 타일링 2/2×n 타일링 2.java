import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static long dp[];
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];

        
        long result = tiling(n);
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static long tiling(int n){
        
        if(n == 1) return 1;
        if(n == 2) return 3;
        
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }

        return dp[n];
    }
}
