import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        int result = -1;

        for (int i = n / 5; i >= 0; i--) {
            int remaining = n - (i * 5);

            if (remaining % 3 == 0) {
                result = i + (remaining / 3);
                break;
            }
        }

        bw.write(Integer.toString(result));
        bw.close();
        br.close();
    }
}
