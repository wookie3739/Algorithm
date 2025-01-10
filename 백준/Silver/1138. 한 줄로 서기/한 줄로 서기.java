import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사람의 수
        int[] arr = new int[N + 1];             // 입력된 키 정보
        int[] sequence = new int[N];           // 결과 배열 (최종 줄)
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 사람을 순서대로 줄 세우기
        for (int i = 1; i <= N; i++) {
            int count = arr[i]; // 자신보다 큰 사람의 수
            for (int j = 0; j < N; j++) {
                if (sequence[j] == 0) { // 빈자리 확인
                    if (count == 0) { // 현재 자리가 올바른 위치
                        sequence[j] = i; // i번 사람 배치
                        break;
                    }
                    count--; // 빈자리 발견 시 count 감소
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sequence[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
