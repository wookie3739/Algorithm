import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[6][6];

        // 빙고판 입력
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] visited = new boolean[6][6]; // 방문 여부
        int callCount = 0; // 호출 횟수
        boolean finished = false;

        // 숫자 호출
        for (int i = 1; i <= 5; i++) {
            if (finished) break;
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                callCount++;
                int calledNumber = Integer.parseInt(st.nextToken());

                // 호출된 숫자 방문 처리
                for (int x = 1; x <= 5; x++) {
                    for (int y = 1; y <= 5; y++) {
                        if (arr[x][y] == calledNumber) {
                            visited[x][y] = true;
                        }
                    }
                }

                // 빙고 체크
                if (checkBingo(visited) >= 3) {
                    System.out.println(callCount);
                    finished = true;
                    break;
                }
            }
        }
    }

    private static int checkBingo(boolean[][] visited) {
        int count = 0;

        // 가로 확인
        for (int i = 1; i <= 5; i++) {
            boolean isBingo = true;
            for (int j = 1; j <= 5; j++) {
                if (!visited[i][j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;
        }

        // 세로 확인
        for (int j = 1; j <= 5; j++) {
            boolean isBingo = true;
            for (int i = 1; i <= 5; i++) {
                if (!visited[i][j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;
        }

        // 대각선 확인
        boolean isDiagonal1 = true;
        boolean isDiagonal2 = true;
        for (int i = 1; i <= 5; i++) {
            if (!visited[i][i]) isDiagonal1 = false;
            if (!visited[i][6 - i]) isDiagonal2 = false;
        }
        if (isDiagonal1) count++;
        if (isDiagonal2) count++;

        return count;
    }
}
