import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < input.length; i++){
            sum += Math.pow(Integer.parseInt(input[i]), 2);
        }
        int result = sum % 10;
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
