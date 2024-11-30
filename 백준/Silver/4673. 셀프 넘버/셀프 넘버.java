import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//셀프 넘버_ 4673
public class Main{
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isSelfNumber = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            int result = d(i);
            if (result <= 10000){
                isSelfNumber[result] = true;
            }
        }

        for(int i = 1; i <= 10000; i++){
            if(!isSelfNumber[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}