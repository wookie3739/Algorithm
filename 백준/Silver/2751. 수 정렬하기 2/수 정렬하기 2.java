import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().trim();

        int[] a = new int[Integer.parseInt(str)];

        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(br.readLine().trim());

        }
        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            bw.write(a[i] + "\n");
        }
        bw.close();
        br.close();
    }

}
