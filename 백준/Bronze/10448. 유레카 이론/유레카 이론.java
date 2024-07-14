import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[45];
        for(int i = 1; i < 45; i++) {
            numbers[i] = i * (i + 1) / 2;
        }
        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int result =  result(n, numbers);
            bw.write(result + "\n");
            
        }
        bw.close();
        br.close();
    }

    public static int result(int N, int[] triNum) {
        for(int j = 1; j < 45; j++) {
            for (int k = 1; k < 45; k++) {
                for (int z = 1; z < 45; z++) {
                    int sum = triNum[j] + triNum[k] + triNum[z];
                    if (sum == N) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}