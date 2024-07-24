import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문자열
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A의 길이는 B의 길이보다 작거나 같음 A<=B


        String[] str = br.readLine().split(" ");

        String A = str[0];
        String B = str[1];

        int min = Integer.MAX_VALUE;

        //A의 길이를 B의 길이에 맞추기 위함.
        for(int i = 0; i <= B.length() - A.length(); i++){
            int diff = 0;

            // 현재 위치에서 A와 B를 비교해서 차이 계산하기.
            for(int j = 0; j < A.length(); j++){
                //1234 12345이면 0번째에서는 1234, 1234 비교 4번 카운트
                //1번째에서는 1234 2345 비교 0번 카운트
                if(A.charAt(j) != B.charAt(i + j)){
                    diff++;
                }
            }

            if(diff < min){
                min = diff;
            }
        }
        bw.write(min + "\n");
        bw.close();
        br.close();
    }
}
