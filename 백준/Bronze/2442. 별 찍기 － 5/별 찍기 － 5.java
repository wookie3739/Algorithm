import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별 찍기 - 5 (2442번)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            result.append(repeatChar(' ', N - i));         // 공백 반복
            result.append(repeatChar('*', (i * 2) - 1));  // 별 반복
            result.append("\n");                      // 줄바꿈
        }

        bw.write(result.toString());  // 결과 출력
        bw.flush();

        bw.close();
        br.close();
    }

    // 특정 문자를 count 횟수만큼 반복하는 문자열 반환 메서드
    public static String repeatChar(char c, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);  // char 값을 추가
        }
        return sb.toString();
    }
}
