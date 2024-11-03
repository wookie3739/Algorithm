import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr; // 동전 종류 저장 배열
    static int[] dp;  // 각 금액을 만드는 방법의 수 저장 DP 배열
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 동전 종류 개수
        int k = Integer.parseInt(st.nextToken()); // 목표 금액

        arr = new int[n];  // 동전 종류를 저장할 배열
        dp = new int[k + 1]; // 각 금액을 만드는 경우의 수를 저장할 배열 (dp 배열)
        dp[0] = 1;  // 0원을 만드는 방법은 1가지 (동전을 사용하지 않는 경우)
        
        // 동전 종류 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // DP 로직: 각 동전에 대해 dp 배열 업데이트
        for (int i = 0; i < n; i++) {       // 각 동전을 순회
            for (int j = arr[i]; j <= k; j++) {  // 현재 동전(arr[i])을 사용하는 경우를 고려
                dp[j] += dp[j - arr[i]];   // j원을 만드는 방법에 'j-arr[i]'원의 경우의 수를 더함
            }
        }

        // 결과 출력
        System.out.println(dp[k]);  // 목표 금액 k원을 만드는 경우의 수 출력
    }
}
