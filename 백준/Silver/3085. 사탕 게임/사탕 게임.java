import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사탕게임_3085
public class Main {
    static char[][] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        /*
        왼쪽은 오른쪽과 같음. 아래는 위와 같음.
        오른쪽과 아래만 보면 됨.
        다시 원래대로 바꿔놔야 되고 max값 하나 정해놔야함.
        */

        // N*N 크기에 사탕 채워넣는다.
        N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        int maxCandy = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 오른쪽부터 검사해보자 현재 기준 0이면 1짜리, 1이면 2짜리, 2일 때는 해당사항 없음.
                if (j + 1 < N) {
                    swap(i, j, i, j + 1);
                    // check해서 가장 긴 연속 부분을 찾자.
                    maxCandy = Math.max(maxCandy, checkMaxCandy());
                    // 원상 복구
                    swap(i, j, i, j + 1);
                }
                // 밑에 검사 ㄱㄱ
                if (i + 1 < N) {
                    swap(i, j, i + 1, j);
                    maxCandy = Math.max(maxCandy, checkMaxCandy());
                    swap(i, j, i + 1, j);
                }
            }
        }
        System.out.println(maxCandy);
    }

    // 교환하기
    public static void swap(int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    // 가장 긴 부분을 찾자(이미 배열을 바꾼 상태)
    public static int checkMaxCandy() {
        int max = 1;

        // 가로 방향 검사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (arr[i][j] == arr[i][j - 1]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            // max에는 사탕의 최대 개수가 들어가있음.
            max = Math.max(max, count);
        }

        // 세로 방향 검사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (arr[j][i] == arr[j - 1][i]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
