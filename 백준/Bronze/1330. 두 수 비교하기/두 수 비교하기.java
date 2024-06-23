import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 수 비교하기
public class Main {
    public static void main(String[] args) {
        try {
            int A;
            int B;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");

            A = Integer.parseInt(str[0]);
            B = Integer.parseInt(str[1]);

            StringBuilder sb = new StringBuilder();

            if(A < B){
                System.out.println(sb.append("<"));
            }else if(A > B){
                System.out.println(sb.append(">"));
            }else{
                System.out.println(sb.append("=="));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}