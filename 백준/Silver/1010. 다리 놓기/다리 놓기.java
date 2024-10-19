import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // 조합 계산을 위한 메서드
    public static int combination(int n, int r) {
        if(r == 0 || n == r) {
            return 1;  // nC0 = 1, nCn = 1
        }
        if(r == 1) {
            return n;  // nC1 = n
        }

        int[][] dp = new int[n + 1][r + 1];

        // 초기값 설정
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;  // nC0 = 1
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];  // 점화식 nCr = n-1Cr-1 + n-1Cr
            }
        }

        return dp[n][r];
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());  // 서쪽 사이트의 개수
            int M = Integer.parseInt(st.nextToken());  // 동쪽 사이트의 개수

            int result = combination(M, N);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
