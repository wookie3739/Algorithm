import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            bw.write("1\n");
        }else{
            bw.write("0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
