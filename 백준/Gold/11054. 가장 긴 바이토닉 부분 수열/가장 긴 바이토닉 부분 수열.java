//가장긴바이토닉부분수열_11054
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] asc_dp;
    static int[] desc_dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        asc_dp = new int[N + 1];
        desc_dp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = bitonic(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int bitonic(int N){

        int max = 0;

        for(int i = 1; i <= N; i++){
            asc_dp[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j]){
                    asc_dp[i] = Math.max(asc_dp[i], asc_dp[j] + 1);
                }
            }
        }

        for(int i = N; i >= 1; i--){
            desc_dp[i] = 1;
            for(int j = N; j > i; j--){
                if(arr[i] > arr[j]){
                    desc_dp[i] = Math.max(desc_dp[i], desc_dp[j] + 1);
                }
            }
        }
        
        for(int i = 1; i <= N; i++){
            max = Math.max(max, asc_dp[i] + desc_dp[i] - 1);
        }

        return max;
    }
}
