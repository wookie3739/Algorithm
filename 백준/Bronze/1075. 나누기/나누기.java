import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        // N의 뒤 두 자리를 00으로 바꾼 값
        int baseN = (N / 100) * 100;
        // F로 나누어 떨어지는 가장 작은 값을 찾기
        int result = baseN;
        while (result % F != 0) {
            result++;
        }

        // result의 마지막 두 자리를 포맷하여 출력
        int lastTwoDigits = result % 100;
        bw.write(String.format("%02d\n", lastTwoDigits));

        bw.flush();
        bw.close();
        br.close();
    }
}
