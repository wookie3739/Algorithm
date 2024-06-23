import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//최댓값
public class Main {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] result = new int[9];

        for(int i = 0; i < result.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            result[i] = Integer.parseInt(st.nextToken());
        }

        int max = result[0];
        int index = 0;
        for(int i = 1; i < result.length; i++){
            if(max < result[i]){
                max = result[i];
                index = i;
            }
        }

        bw.write(String.valueOf(max) + "\n" + String.valueOf(index + 1));
        bw.flush();
        bw.close();
        br.close();        
    }
}