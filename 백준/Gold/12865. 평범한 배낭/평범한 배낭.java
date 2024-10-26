import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 물품의 개수
        int K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 최대 무게

        int[] dp = new int[K + 1]; // 최대 무게 K까지 담을 수 있는 가치를 기록하는 배열

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken()); // 물건의 무게
            int value = Integer.parseInt(st.nextToken());  // 물건의 가치

            // dp 배열을 뒤에서부터 업데이트하여 무게 초과 방지
            for (int j = K; j >= weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
        }

        bw.write(dp[K] + "\n"); // K 무게에서의 최대 가치를 출력
        bw.flush();
        bw.close();
        br.close();
    }
}