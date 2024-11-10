import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] binomial = new int[N + 1][K + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= Math.min(i, K); j++) {
                if (j == 0 || j == i) {
                    binomial[i][j] = 1;
                } else {
                    binomial[i][j] = (binomial[i - 1][j - 1] + binomial[i - 1][j]) % MOD;
                }
            }
        }
        bw.write(binomial[N][K] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
