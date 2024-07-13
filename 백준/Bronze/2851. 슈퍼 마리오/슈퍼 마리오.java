import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//슈퍼 마리오
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(br.readLine().trim());
        }

        int sum = 0;
        int before = 0;
        int after = 0;

        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum <= 100){
                before = sum;
            }else{
                after = sum;
                break;
            }
        }
        if(after == 0){
            after = sum;
        }
        //100에 가까운 수 출력하는데 제일 큰 값 출력
        if(100 - before > after - 100){
            bw.write(after + "\n");
        }else if(100 - before < after - 100){
            bw.write(before + "\n");
        }else{
            bw.write(Math.max(before, after) + "\n");
        }
       
        bw.close();
        br.close();
    }
}
