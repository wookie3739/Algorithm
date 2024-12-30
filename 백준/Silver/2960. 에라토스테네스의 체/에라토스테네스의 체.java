import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();

        // 리스트 초기화 (2부터 N까지)
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }

        int count = 0; // 제거된 수를 카운트

        // 리스트가 비어있지 않을 동안 반복
        while (!list.isEmpty()) {
            int prime = list.get(0); // 현재 소수
            Iterator<Integer> iterator = list.iterator();

            // Iterator를 사용해 리스트 순회 및 제거
            while (iterator.hasNext()) {
                int current = iterator.next();
                if (current % prime == 0) { // 소수의 배수인 경우
                    count++;
                    iterator.remove(); // 안전하게 요소 제거

                    if (count == K) {
                        System.out.println(current); // K번째로 제거된 수 출력
                        return;
                    }
                }
            }
        }
    }
}
