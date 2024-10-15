import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());

        int[] floors = new int[T + 1];
        int[] dp = new int[T + 1];

        for(int i = 1; i < floors.length; i++){
            floors[i] = Integer.parseInt(br.readLine());
        }
        if(T >= 1) dp[1] = floors[1]; // 첫 번째 계단의 점수
        if(T >= 2) dp[2] = floors[1] + floors[2]; // 첫 번째와 두 번째 계단의 합

        for(int i = 3; i < floors.length; i++){
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + floors[i - 1]) + floors[i];
        }

        bw.write(dp[T] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
        
}
