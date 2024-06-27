import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int A = Integer.parseInt(br.readLine().trim());
            int B = Integer.parseInt(br.readLine().trim());
            int C = Integer.parseInt(br.readLine().trim());
            int result = A * B * C ;

            String resultStr = Integer.toString(result);

            int[] arr = new int[10];

            for(int i = 0; i < arr.length; i++){

                arr[i] = 0;
            }

            for(int i = 0; i < resultStr.length(); i++){
                char ch = resultStr.charAt(i);

                arr[ch - '0']++;
            }

            for( int i = 0; i < arr.length; i++){
                
                bw.write(arr[i] + "\n");
            }

            bw.close();
            br.close();

    }
}