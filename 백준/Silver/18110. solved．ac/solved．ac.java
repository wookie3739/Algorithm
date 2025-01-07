import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        // 극단값 제외 개수 계산
        int trimCount = (int) Math.round(N * 0.15);

        // 남은 데이터의 합 계산
        int sum = 0;
        for (int i = trimCount; i < N - trimCount; i++) {
            sum += list.get(i);
        }

        // 제외 후 남은 데이터의 개수
        int remainingCount = N - (2 * trimCount);

        // 평균 계산 및 출력
        int result = (remainingCount > 0) ? (int) Math.round((double) sum / remainingCount) : 0;
        System.out.println(result);
    }
}
