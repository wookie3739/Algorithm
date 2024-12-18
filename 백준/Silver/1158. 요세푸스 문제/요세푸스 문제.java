import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 요세푸스 문제 (백준 1158)
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0; // 시작 인덱스
        bw.write("<");

        while (!list.isEmpty()) {
            // 현재 인덱스 계산 (K-1만큼 이동한 후 모듈러 연산으로 순환 구조를 만듦)
            index = (index + K - 1) % list.size();
            
            // 제거된 사람을 결과에 추가
            bw.write(list.get(index).toString());
            list.remove(index);
            
            // 남은 사람이 있으면 콤마(,) 추가
            if (!list.isEmpty()) {
                bw.write(", ");
            }
        }

        bw.write(">");
        bw.flush();
        bw.close();
        br.close();
    }
}
