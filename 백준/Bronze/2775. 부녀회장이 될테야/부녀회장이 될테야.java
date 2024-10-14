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

        int arr[][] = new int[15][15];

        for(int i = 1; i <= 14; i++){
            arr[0][i] = i;
        }

        for(int k = 1; k <= 14; k++){
            for(int n = 1; n <= 14; n++){
                arr[k][n] = arr[k-1][n] + arr[k][n-1];
            }
        }

        for(int t = 0; t < T; t++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(arr[k][n]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
