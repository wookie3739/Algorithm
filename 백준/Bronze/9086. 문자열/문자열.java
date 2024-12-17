import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String input = br.readLine();
            if(input.length() == 1){
                bw.write(input + input + "\n");
            }else{
                int length = input.length();
                bw.write("" + input.charAt(0) + input.charAt(length - 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
