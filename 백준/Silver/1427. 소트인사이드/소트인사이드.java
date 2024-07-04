import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

//역순 배열
public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().trim();

        Character[] a = new Character[str.length()];

        for(int i = 0; i < a.length; i++){
            char ch = str.charAt(i);
            a[i] = ch;


        }
        Arrays.sort(a, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            sb.append(a[i]);
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
