import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[6];
        
        String input = br.readLine();
        String[] inputSplit = input.split(" ");
        
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(inputSplit[i]); 
            bw.write((standard[i] - arr[i]) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
