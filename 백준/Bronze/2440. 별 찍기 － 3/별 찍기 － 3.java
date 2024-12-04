import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//별 찍기 - 3  2440
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num = N;
        while(num > 0){
            for(int i = 0; i < num; i++){
                bw.write("*");
            }
            bw.write("\n");
            num--;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
