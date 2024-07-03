import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Boolean> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());


        while(st.hasMoreTokens()){
            map.put(Integer.parseInt(st.nextToken()), true);
        }

        int m = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine().trim());
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());

            if(map.containsKey(num)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
