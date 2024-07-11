import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int count = 0; // 약수의 개수를 세기 위한 변수

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    bw.write(String.valueOf(i));
                    bw.close();
                    br.close();
                    return;
                }
            }
        }

        // 만약 K번째 약수를 찾지 못한 경우
        bw.write("0");
        bw.close();
        br.close();
    }
}
