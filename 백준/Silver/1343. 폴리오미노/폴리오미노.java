import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 폴리오미노_1343
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        // '.'을 기준으로 나눈 각 구간 처리
        String[] sections = input.split("\\.", -1);

        for (int i = 0; i < sections.length; i++) {
            String x = sections[i];

            // 구간의 길이가 2 미만이거나 홀수인 경우
            if (x.length() % 2 != 0) {
                System.out.println("-1");
                return;
            }

            // 폴리오미노 채우기
            sb.append("AAAA".repeat(x.length() / 4)); // 4의 배수 만큼 'XXXX'
            sb.append("BB".repeat((x.length() % 4) / 2)); // 남은 2의 배수는 'BB'

            // 구간 사이에 점 추가 (마지막 구간 제외)
            if (i < sections.length - 1) {
                sb.append(".");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
