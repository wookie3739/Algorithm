import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별찍기9_2446
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 위쪽 부분
        for (int i = 0; i < N; i++) {
            bw.write(" ".repeat(i) + "*".repeat(2 * (N - i) - 1) + "\n");
        }

        // 아래쪽 부분
        for (int i = N - 2; i >= 0; i--) {
            bw.write(" ".repeat(i) + "*".repeat(2 * (N - i) - 1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
