import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 스위치 수
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> switches = new HashMap<>();

        // 스위치 상태 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            switches.put(i, Integer.parseInt(st.nextToken()));
        }

        // 학생 수
        int ppl = Integer.parseInt(br.readLine());

        // 학생 행동 처리
        for (int i = 0; i < ppl; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int switchNumber = Integer.parseInt(st.nextToken());

            if (gender == 1) { // 남학생
                for (int j = switchNumber; j <= N; j += switchNumber) {
                    switches.put(j, switches.get(j) == 0 ? 1 : 0);
                }
            } else { // 여학생
                switches.put(switchNumber, switches.get(switchNumber) == 0 ? 1 : 0);
                int left = switchNumber - 1, right = switchNumber + 1;
                while (left >= 1 && right <= N && switches.get(left).equals(switches.get(right))) {
                    switches.put(left, switches.get(left) == 0 ? 1 : 0);
                    switches.put(right, switches.get(right) == 0 ? 1 : 0);
                    left--;
                    right++;
                }
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(switches.get(i)).append(" ");
            if (i % 20 == 0) sb.append("\n");
        }
        System.out.print(sb);
    }
}
