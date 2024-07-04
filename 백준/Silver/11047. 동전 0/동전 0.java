import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//동전 0
public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int items = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] coins = new int[items];

        for(int i = 0; i < coins.length; i++){
            coins[i] = Integer.parseInt(br.readLine().trim());
        }

        int count = 0;

        for(int i = items-1; i >= 0 ; i--){
            if(money / coins[i] != 0){
                int quota = money / coins[i];
                int remaining = money - ( quota * coins[i]);
                count += quota;
                money = remaining;
            }
        }
        bw.write(Integer.toString(count));
        bw.close();
        br.close();
    }
}
