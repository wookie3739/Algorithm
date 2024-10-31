import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // N과 M 입력
        String[] inputs = reader.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        // 표 초기화
        int[][] table = new int[N + 1][N + 1]; // 1-based index 사용
        for (int i = 1; i <= N; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                table[i][j] = Integer.parseInt(row[j - 1]);
            }
        }

        // 누적합 배열 초기화
        long[][] dp = new long[N + 1][N + 1]; // long형 사용하여 큰 수 처리
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = table[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        // 쿼리 처리
        for (int k = 0; k < M; k++) {
            String[] query = reader.readLine().split(" ");
            int x1 = Integer.parseInt(query[0]);
            int y1 = Integer.parseInt(query[1]);
            int x2 = Integer.parseInt(query[2]);
            int y2 = Integer.parseInt(query[3]);

            // 범위 합 계산
            long sum = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1];
            writer.write(sum + "\n");
        }

        // 결과 출력
        writer.flush();

        // BufferedReader와 BufferedWriter 닫기
        reader.close();
        writer.close();
    }
}
