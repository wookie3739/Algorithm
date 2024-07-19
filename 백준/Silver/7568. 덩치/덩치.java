import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//덩치
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ppl = Integer.parseInt(br.readLine().trim());

        int[] kg = new int[ppl];
        int[] cm = new int[ppl];

        for(int i = 0; i < ppl; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            kg[i] = Integer.parseInt(st.nextToken());
            cm[i] = Integer.parseInt(st.nextToken());
        } 

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < ppl; i++){
            int rank = 1;
            for(int j = 0; j < ppl; j++){
                if(kg[i] < kg[j] && cm[i] < cm[j]){
                    if(kg[i] == kg[j]){
                        continue;
                    }
                    rank++;
                }
            }
            sb.append(rank + " ");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
