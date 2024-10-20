import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[n + 1];

        int result = continuousSum(n);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int continuousSum(int n){
        dp[0] = arr[0];
        //dp[0] = 10, max = 10
        int max = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            //dp[1] = -4, 10 - 4 => 6, max = 10
            //dp[2] = 3, 6 + 3 => 9, max = 10
            //dp[3] = 1, 9 + 1 => 10, max = 10
            //dp[4] = 5, 10 + 5 => 15, max = 15
            //dp[5] = 6, 15 + 6 => 21, max = 21
            //dp[6] = -35, 21 - 35 => -14, max = 21
            //dp[7] = 12, -14 + 12 => 12, max = 21
            //dp[8] = 21, 12 + 21 => 33, max = 33
            if(dp[i] > max){
                max = dp[i];
            }
        }

        return max;

    }
}
