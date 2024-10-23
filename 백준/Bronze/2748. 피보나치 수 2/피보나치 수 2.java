import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] fib = new long[n + 1]; // 피보나치 수를 저장할 배열, n이 90일 수 있으므로 long 사용
        fib[0] = 0; // 0번째 피보나치 수
        if (n > 0) {
            fib[1] = 1; // 1번째 피보나치 수
        }

        // 2번째부터 n번째까지 피보나치 수 계산
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // n번째 피보나치 수 출력
        bw.write(fib[n] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
