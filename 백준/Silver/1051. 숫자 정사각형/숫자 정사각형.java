import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자정사각형_1051: 가장 큰 정사각형 크기 찾기
public class Main {
    static int N, M; // 배열의 크기를 저장할 변수
    static int[][] arr; // 입력받을 2차원 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N과 M 입력받기
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 행의 개수
        M = Integer.parseInt(st.nextToken()); // 열의 개수

        arr = new int[N][M]; // 배열 초기화

        // 배열 값 입력받기
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Character.getNumericValue(input.charAt(j)); // 문자열의 각 문자를 숫자로 변환
            }
        }

        // 정사각형의 최대 변 길이 계산
        int maxLength = Math.min(N, M); // 배열 크기 중 작은 값을 기준으로 최대 변 길이를 설정

        if (maxLength == 1) {
            // 배열 크기가 1x1인 경우
            System.out.println(1);
        } else {
            // 배열이 2x2 이상인 경우, 가장 큰 정사각형 크기를 계산
            System.out.println(findMySize(maxLength));
        }
    }
    public static int findMySize(int maxLength) {
        int result = 1; // 결과 값 초기화 (최소 정사각형 크기는 1x1)

        // 가능한 모든 정사각형 크기(len)에 대해 탐색
        for (int len = 2; len <= maxLength; len++) {
            // 배열의 각 시작 지점(i, j)을 탐색
            for (int i = 0; i <= N - len; i++) {
                for (int j = 0; j <= M - len; j++) {
                    // 네 꼭짓점의 값이 같은지 확인
                    if (arr[i][j] == arr[i][j + len - 1] && // 윗변 오른쪽 끝
                        arr[i][j] == arr[i + len - 1][j] && // 왼쪽 아래 끝
                        arr[i][j] == arr[i + len - 1][j + len - 1]) { // 오른쪽 아래 끝

                        result = Math.max(result, len); // 가장 큰 변 길이를 갱신
                    }
                }
            }
        }
        // 정사각형의 넓이를 반환 (변 길이 * 변 길이)
        return result * result;
    }
}
