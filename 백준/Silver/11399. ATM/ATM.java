import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().trim();

        int[] a = new int[Integer.parseInt(str)];

        int index = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()){
            a[index++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int sum = 0;
        int addSum = 0;

        for(int i = 0; i < a.length; i++){
            sum += a[i];
            addSum += sum;
        }
        
        bw.write(Integer.toString(addSum));
        bw.close();
        br.close();
    }
}
