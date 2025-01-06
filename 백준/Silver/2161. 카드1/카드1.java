import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 카드1_2161
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        // 큐가 비어있을 때까지 반복
        while (!q.isEmpty()) {
            // 첫 번째 숫자를 꺼내서 리스트에 저장
            list.add(q.poll());
            // 두 번째 숫자를 꺼내서 다시 큐의 뒤에 추가 (큐가 비어있지 않은 경우만)
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }

        for (int n : list) {
            System.out.print(n + " ");
        }
        br.close();
    }
}
