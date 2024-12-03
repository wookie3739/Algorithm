import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[31];

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = 1;
        }

        int max = 0;
        int min = 31;

        for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }

        bw.write(min + "\n" + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
