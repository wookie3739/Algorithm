import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int[][] triangle;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());  // 삼각형의 크기

        triangle = new int[n][n];
        dp = new int[n][n];

        // 삼각형 데이터 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // DP 테이블을 채우면서 최대 경로 합 계산
        int result = max_path(n);

        // 결과 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int max_path(int n) {
        // 초기값 설정 (맨 꼭대기 값)
        dp[0][0] = triangle[0][0];

        // DP 테이블 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 삼각형의 가장 왼쪽 경로는 무조건 위에서 바로 내려온다.
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i) {
                    // 삼각형의 가장 오른쪽 경로는 바로 왼쪽 대각선에서만 내려올 수 있다.
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    // 나머지는 왼쪽 대각선과 오른쪽 대각선 중 큰 값을 선택
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 층에서 최대값 찾기
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[n - 1][i]);
        }

        return max;
    }
}
