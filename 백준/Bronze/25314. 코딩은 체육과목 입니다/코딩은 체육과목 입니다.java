import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//코딩은 체육과목입니다 25314
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int EA = N / 4;

        for(int i = 0; i < EA; i++){
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
        br.close();
    }
}
