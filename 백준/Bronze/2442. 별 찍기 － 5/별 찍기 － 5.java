import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//별 찍기 - 5 2442번
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            bw.write(" ".repeat(N - i) + "*".repeat((i * 2) - 1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
