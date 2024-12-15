import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별찍기-7 2444
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        
        // for (int i = 1; i <= 2 * N - 1; i++) {
        //     int starCount = i <= N ? 2 * i - 1 : 2 * (2 * N - i) - 1; // 위쪽, 아래쪽 별의 개수
        //     int spaceCount = Math.abs(N - i); // 공백의 개수 (위, 아래 공통)

        //     System.out.print(" ".repeat(spaceCount)); // 공백 출력
        //     System.out.println("*".repeat(starCount)); // 별 출력
        // }
        bw.flush();
        bw.close();
        br.close();
    }
}
