import java.io.BufferedReader;
import java.io.InputStreamReader;

// 별 반대로 찍기
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();

        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            // 공백 추가
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(" ");
            }

            // 별 추가
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }

            System.out.println(sb.toString());
        }
    }
}