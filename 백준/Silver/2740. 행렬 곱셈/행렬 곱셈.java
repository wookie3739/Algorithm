import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 곱셈 문제 (백준 2740)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 행렬 A의 크기 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행렬 A의 행 크기
        int M = Integer.parseInt(st.nextToken()); // 행렬 A의 열 크기

        // 행렬 A 입력
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B의 크기 입력
        st = new StringTokenizer(br.readLine());
        int M2 = Integer.parseInt(st.nextToken()); // 행렬 B의 행 크기 (A의 열 크기와 같아야 함)
        int K = Integer.parseInt(st.nextToken()); // 행렬 B의 열 크기

        // 행렬 B 입력
        int[][] B = new int[M2][K];
        for (int i = 0; i < M2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 곱셈 결과 행렬 C 계산
        int[][] C = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < M; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                sb.append(C[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
