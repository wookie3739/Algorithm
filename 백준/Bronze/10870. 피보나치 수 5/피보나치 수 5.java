import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = fibonacci(n);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
    public static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
