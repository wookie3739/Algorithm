import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine().trim()); // 테스트 케이스의 개수
        
        // 테스트 케이스마다 입력 받기
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        // 가장 큰 입력값을 기준으로 DP 배열을 미리 계산
        int maxN = 0;
        for (int i = 0; i < t; i++) {
            if (arr[i] > maxN) {
                maxN = arr[i];
            }
        }

        // DP 배열을 선언하고 초기값 설정
        int[] dp = new int[maxN + 1];
        dp[0] = 1; // 0을 만드는 방법은 1가지 (아무것도 안 더하는 경우)
        
        if (maxN >= 1) dp[1] = 1; // 1을 만드는 방법은 1 (1)
        if (maxN >= 2) dp[2] = 2; // 2를 만드는 방법은 2 (1+1, 2)
        if (maxN >= 3) dp[3] = 4; // 3을 만드는 방법은 4 (1+1+1, 1+2, 2+1, 3)
        
        // DP 테이블 채우기
        for (int i = 4; i <= maxN; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 결과 출력
        for (int i = 0; i < t; i++) {
            bw.write(dp[arr[i]] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
