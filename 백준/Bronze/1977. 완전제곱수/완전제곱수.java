import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
//완전제곱수
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i * i <= N; i++){
            int square = i*i;
            if(square >= M){
                sum += square;
                list.add(square);
            }
        }
        if(list.isEmpty()){
            bw.write("-1");
        }else{
            bw.write(sum + "\n");
            bw.write(list.get(0) + "\n");
        }
        bw.close();
        br.close();
    }
}
