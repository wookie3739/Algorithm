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
        int E = Integer.parseInt(str[0]);
        int S = Integer.parseInt(str[1]);
        int M = Integer.parseInt(str[2]);

        int count = 1;
        while (true) {
            if ((count - E) % 15 == 0 && (count - S) % 28 == 0 && (count - M) % 19 == 0) {
                break;
            }
            count++;
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
